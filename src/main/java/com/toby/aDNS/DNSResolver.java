package com.toby.aDNS;

import org.xbill.DNS.ExtendedResolver;
import org.xbill.DNS.Message;

import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.concurrent.Callable;

public class DNSResolver implements Callable<Message> {

    private Message qmsg;
    private ExtendedResolver resolver;

    DNSResolver(int timeout, Message msg, String server) throws UnknownHostException {
        resolver = new ExtendedResolver(server.split(","));
        resolver.setTimeout(timeout);
        qmsg = msg;
    }

    @Override
    public Message call() throws Exception {
        Message rmsg = null;
        try {
            resolver.setTCP(true);
            rmsg = resolver.send(qmsg);
        } catch (ConnectException e) {
            resolver.setTCP(false);
            rmsg = resolver.send(qmsg);
        } catch (IOException e) {
            SimpleLog.log("Failed to resolve " + qmsg.getQuestion().getName() + ": " + e.toString());
        }
        return rmsg;
    }

}
