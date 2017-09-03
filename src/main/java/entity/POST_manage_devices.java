package entity;

public class POST_manage_devices {
    private String register_code;
    private String serial_number;

    public  POST_manage_devices(){}

    public POST_manage_devices(String register_code, String serial_number) {
        this.register_code = register_code;
        this.serial_number = serial_number;
    }

    public String getRegister_code() {
        return register_code;
    }

    public void setRegister_code(String register_code) {
        this.register_code = register_code;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    @Override
    public String toString() {
        return "POST_manage_devices{" +
                "register_code='" + register_code + '\'' +
                ", serial_number='" + serial_number + '\'' +
                '}';
    }
}
