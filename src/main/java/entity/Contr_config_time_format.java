package entity;

public class Contr_config_time_format {
    private String error_handling;
    private String format;

    public Contr_config_time_format(){}

    public Contr_config_time_format(String error_handling, String format) {
        this.error_handling = error_handling;
        this.format = format;
    }

    public String getError_handling() {
        return error_handling;
    }

    public void setError_handling(String error_handling) {
        this.error_handling = error_handling;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Contr_config_time_format{" +
                "error_handling='" + error_handling + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}
