package entity;

public class Contr_update_firmware {
    private String error_handling;
    private String file_name;

    public Contr_update_firmware(){}

    public Contr_update_firmware(String error_handling, String file_name) {
        this.error_handling = error_handling;
        this.file_name = file_name;
    }

    public String getError_handling() {
        return error_handling;
    }

    public void setError_handling(String error_handling) {
        this.error_handling = error_handling;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    @Override
    public String toString() {
        return "Contr_log{" +
                "error_handling='" + error_handling + '\'' +
                ", file_name='" + file_name + '\'' +
                '}';
    }
}
