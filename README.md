# anchorDNS ![adnsLogo][1]

**anchorDNS** ��һ�������ڱ��صķ���DNS������

#���ܸ�ɶ��

������֪�� [CHNRoutes][2] ��Ŀ�ܹ��޸�ϵͳ·�ɱ�ʹ��VPN�� �й�IP��Ȼֱ�����ӣ�����������ͨ��VPN�Է�ֹ������վҲͨ��VPN���С�Ȼ��Ϊ�˽��DNS��Ⱦ��һ�����DNS����ȫ����VPN������DNS���������������CDN���й�����������й���վ ��Ȼ��������������ڷ���ѷ��������ͷ����ٶȡ�

anchorDNS ����Ϊ������������ƣ�ͨ���ȴӹ���DNS�������������������й�IP��ֱ�ӷ��ؽ���������й�IP����þ���DNS�����ķ��� �ܹ�����ȫ���ֹ�����վ�Ľ�����ȷ �ֻ������Ⱦ�ľ�����վDNS��ѯ�����**�û�ֻ��ֱ��ṩһ���Լ�ϲ���Ĺ���DNS�����DNS��ַ����һ���й�IP�ε�CIDR�����Դ���**

ʾ������
���� www.baidu.com -> ͬʱ��ѯ114.114.114.114(ֱ��)/8.8.8.8(��VPN) -> �������й�IP��վ -> ʹ��ֱ��114.114.114.114�Ľ��
���� twitter.com -> ͬʱ��ѯ114.114.114.114(ֱ��)/8.8.8.8(��VPN) -> ���ַ��й�IP��վ -> ʹ����VPN��8.8.8.8�Ľ��������Ⱦ��

#ʹ������

ȥ Release �������°棬��ѹ��binĿ¼�� ���������� anchorDNS

������⡪��

    usage: anchorDNS
     -a,--alternativeDNS <arg>   Specify the alternative DNS server. Default:
                                 8.8.8.8
     -c,--cidr <arg>             Specify the CIDR list. Default: ChinaCIDR.txt
     -d,--defaultDNS <arg>       Specify the default DNS server. Default:
                                 114.114.114.114
     -h,--help                   Show this help message.
     -i,--ip <arg>               Specify the listening IP. Default: 127.0.0.1
     -n,--nocache                Disable results cache.
     -p,--port <arg>             Specify the listening port. Default: 53
     -t,--timeout <arg>          Specify the DNS time out (sec). Default: 1

    -a ָ������DNS������
    -c ָ���й�IP CIDR�����ñ���Ŀ�µ� **ChinaCIDR.txt** �� [�˴��������°�][3]��
    -d ָ������DNS������
    -i ָ������IP��������ʹ��Ĭ��127.0.0.1��
    -n ���ò�ѯ����
    -p ָ�������˿�
    -t DNS��ѯ��ʱʱ�� ��λ���� Ĭ��Ϊ2

����ֱ�Ӳ����κβ���ʹ��Ĭ��ֵʹ�ã�Ҳ�ɽ����Զ����磺 `anchorDNS -d 1.2.4.8 -a 8.8.4.4 -c ChinaCIDR.txt`

**Ȼ�����û�����DNS������Ϊ 127.0.0.1 **

#����ϸ��

ʹ�� Netty 5.0 / dnsjava ����DNSͨ�ţ�Gradle������JDK1.6+

  [1]: logo.png "anchorDNS"
  [2]: https://github.com/fivesheep/chnroutes
  [3]: http://www.ipdeny.com/ipblocks/data/aggregated/cn-aggregated.zone