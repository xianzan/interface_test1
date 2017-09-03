package entity;

public class Put_manage_devices {
    private String ip_address;
    private String user_id;

    public  Put_manage_devices(){}

    public Put_manage_devices(String ip_address, String user_id) {
        this.ip_address = ip_address;
        this.user_id = user_id;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Put_manage_devices{" +
                "ip_address='" + ip_address + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }
}
