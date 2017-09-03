package entity;

public class Contr_register_wifi_accesspoint {
    private String dhcp;
    private String dns1;
    private String dns2;
    private String eap;
    private String eap_anid;
    private String eap_cacert;
    private String eap_cert;
    private String eap_id;
    private String eap_phase2;
    private String error_handling;
    private String gateway;
    private String network_mask;
    private String passwd;
    private String proxy;
    private String proxy_host;
    private String proxy_port;
    private String security;

    public  Contr_register_wifi_accesspoint(){}

    public Contr_register_wifi_accesspoint(String dhcp, String dns1, String dns2, String eap, String eap_anid, String eap_cacert, String eap_cert, String eap_id, String eap_phase2, String error_handling, String gateway, String network_mask, String passwd, String proxy, String proxy_host, String proxy_port, String security) {
        this.dhcp = dhcp;
        this.dns1 = dns1;
        this.dns2 = dns2;
        this.eap = eap;
        this.eap_anid = eap_anid;
        this.eap_cacert = eap_cacert;
        this.eap_cert = eap_cert;
        this.eap_id = eap_id;
        this.eap_phase2 = eap_phase2;
        this.error_handling = error_handling;
        this.gateway = gateway;
        this.network_mask = network_mask;
        this.passwd = passwd;
        this.proxy = proxy;
        this.proxy_host = proxy_host;
        this.proxy_port = proxy_port;
        this.security = security;
    }

    public String getDhcp() {
        return dhcp;
    }

    public void setDhcp(String dhcp) {
        this.dhcp = dhcp;
    }

    public String getDns1() {
        return dns1;
    }

    public void setDns1(String dns1) {
        this.dns1 = dns1;
    }

    public String getDns2() {
        return dns2;
    }

    public void setDns2(String dns2) {
        this.dns2 = dns2;
    }

    public String getEap() {
        return eap;
    }

    public void setEap(String eap) {
        this.eap = eap;
    }

    public String getEap_anid() {
        return eap_anid;
    }

    public void setEap_anid(String eap_anid) {
        this.eap_anid = eap_anid;
    }

    public String getEap_cacert() {
        return eap_cacert;
    }

    public void setEap_cacert(String eap_cacert) {
        this.eap_cacert = eap_cacert;
    }

    public String getEap_cert() {
        return eap_cert;
    }

    public void setEap_cert(String eap_cert) {
        this.eap_cert = eap_cert;
    }

    public String getEap_id() {
        return eap_id;
    }

    public void setEap_id(String eap_id) {
        this.eap_id = eap_id;
    }

    public String getEap_phase2() {
        return eap_phase2;
    }

    public void setEap_phase2(String eap_phase2) {
        this.eap_phase2 = eap_phase2;
    }

    public String getError_handling() {
        return error_handling;
    }

    public void setError_handling(String error_handling) {
        this.error_handling = error_handling;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getNetwork_mask() {
        return network_mask;
    }

    public void setNetwork_mask(String network_mask) {
        this.network_mask = network_mask;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public String getProxy_host() {
        return proxy_host;
    }

    public void setProxy_host(String proxy_host) {
        this.proxy_host = proxy_host;
    }

    public String getProxy_port() {
        return proxy_port;
    }

    public void setProxy_port(String proxy_port) {
        this.proxy_port = proxy_port;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    @Override
    public String toString() {
        return "Contr_register_wifi_accesspoint{" +
                "dhcp='" + dhcp + '\'' +
                ", dns1='" + dns1 + '\'' +
                ", dns2='" + dns2 + '\'' +
                ", eap='" + eap + '\'' +
                ", eap_anid='" + eap_anid + '\'' +
                ", eap_cacert='" + eap_cacert + '\'' +
                ", eap_cert='" + eap_cert + '\'' +
                ", eap_id='" + eap_id + '\'' +
                ", eap_phase2='" + eap_phase2 + '\'' +
                ", error_handling='" + error_handling + '\'' +
                ", gateway='" + gateway + '\'' +
                ", network_mask='" + network_mask + '\'' +
                ", passwd='" + passwd + '\'' +
                ", proxy='" + proxy + '\'' +
                ", proxy_host='" + proxy_host + '\'' +
                ", proxy_port='" + proxy_port + '\'' +
                ", security='" + security + '\'' +
                '}';
    }
}
