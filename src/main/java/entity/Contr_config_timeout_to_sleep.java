package entity;

public class Contr_config_timeout_to_sleep {
    private String error_handling;
    private String timeout;

    public Contr_config_timeout_to_sleep(){}

    public Contr_config_timeout_to_sleep(String error_handling, String timeout) {
        this.error_handling = error_handling;
        this.timeout = timeout;
    }

    public String getError_handling() {
        return error_handling;
    }

    public void setError_handling(String error_handling) {
        this.error_handling = error_handling;
    }

    public String getTmeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    @Override
    public String toString() {
        return "Contr_config_time_format{" +
                "error_handling='" + error_handling + '\'' +
                ", format='" + timeout + '\'' +
                '}';
    }
}
