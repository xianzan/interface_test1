package entity;

public class Put_manage_queues {
    private String api;
    private String error_code;
    private String priority;
    private String request_date;
    private String request_id;
    private String serial_number;
    private String status;
    private String user_id;

    public Put_manage_queues(){}

    public Put_manage_queues(String api, String error_code, String priority, String request_date, String request_id, String serial_number, String status, String user_id) {
        this.api = api;
        this.error_code = error_code;
        this.priority = priority;
        this.request_date = request_date;
        this.request_id = request_id;
        this.serial_number = serial_number;
        this.status = status;
        this.user_id = user_id;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getRequest_date() {
        return request_date;
    }

    public void setRequest_date(String request_date) {
        this.request_date = request_date;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Put_manage_queues{" +
                "api='" + api + '\'' +
                ", error_code='" + error_code + '\'' +
                ", priority='" + priority + '\'' +
                ", request_date='" + request_date + '\'' +
                ", request_id='" + request_id + '\'' +
                ", serial_number='" + serial_number + '\'' +
                ", status='" + status + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }
}
