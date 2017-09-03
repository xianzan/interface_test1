package entity.entityutil;

/**
 * post请求实体类
 */
public class Process {
    private String document_path_type;
    private String document_path_value;
    private String error_handling;
    private String result_folder_path;
    private String indication_id;
    private String show_animation;
    private String delete_mode;
    private String entry_type;
    private String folder_path_type;
    private String folder_path_value;
    private String page;
    private String entry_file_path;
    private String entry_name;
    private String ext_id;
    private String put_mode;
    private String rename_mode;
    private String create_mode;

    private Document_attribute document_attribute;

    private Dialog_params dialog_params;

    public Process(){}

    public Process(String document_path_type, String document_path_value, String error_handling, String result_folder_path, String indication_id, String show_animation, String delete_mode, String entry_type, String folder_path_type, String folder_path_value, String page, String entry_file_path, String entry_name, String ext_id, String put_mode, String rename_mode, String create_mode, Document_attribute document_attribute, Dialog_params dialog_params) {
        this.document_path_type = document_path_type;
        this.document_path_value = document_path_value;
        this.error_handling = error_handling;
        this.result_folder_path = result_folder_path;
        this.indication_id = indication_id;
        this.show_animation = show_animation;
        this.delete_mode = delete_mode;
        this.entry_type = entry_type;
        this.folder_path_type = folder_path_type;
        this.folder_path_value = folder_path_value;
        this.page = page;
        this.entry_file_path = entry_file_path;
        this.entry_name = entry_name;
        this.ext_id = ext_id;
        this.put_mode = put_mode;
        this.rename_mode = rename_mode;
        this.create_mode = create_mode;
        this.document_attribute = document_attribute;
        this.dialog_params = dialog_params;
    }

    public String getDocument_path_type() {
        return document_path_type;
    }

    public void setDocument_path_type(String document_path_type) {
        this.document_path_type = document_path_type;
    }

    public String getDocument_path_value() {
        return document_path_value;
    }

    public void setDocument_path_value(String document_path_value) {
        this.document_path_value = document_path_value;
    }

    public String getError_handling() {
        return error_handling;
    }

    public void setError_handling(String error_handling) {
        this.error_handling = error_handling;
    }

    public String getResult_folder_path() {
        return result_folder_path;
    }

    public void setResult_folder_path(String result_folder_path) {
        this.result_folder_path = result_folder_path;
    }

    public String getIndication_id() {
        return indication_id;
    }

    public void setIndication_id(String indication_id) {
        this.indication_id = indication_id;
    }

    public String getShow_animation() {
        return show_animation;
    }

    public void setShow_animation(String show_animation) {
        this.show_animation = show_animation;
    }

    public String getDelete_mode() {
        return delete_mode;
    }

    public void setDelete_mode(String delete_mode) {
        this.delete_mode = delete_mode;
    }

    public String getEntry_type() {
        return entry_type;
    }

    public void setEntry_type(String entry_type) {
        this.entry_type = entry_type;
    }

    public String getFolder_path_type() {
        return folder_path_type;
    }

    public void setFolder_path_type(String folder_path_type) {
        this.folder_path_type = folder_path_type;
    }

    public String getFolder_path_value() {
        return folder_path_value;
    }

    public void setFolder_path_value(String folder_path_value) {
        this.folder_path_value = folder_path_value;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getEntry_file_path() {
        return entry_file_path;
    }

    public void setEntry_file_path(String entry_file_path) {
        this.entry_file_path = entry_file_path;
    }

    public String getEntry_name() {
        return entry_name;
    }

    public void setEntry_name(String entry_name) {
        this.entry_name = entry_name;
    }

    public String getExt_id() {
        return ext_id;
    }

    public void setExt_id(String ext_id) {
        this.ext_id = ext_id;
    }

    public String getPut_mode() {
        return put_mode;
    }

    public void setPut_mode(String put_mode) {
        this.put_mode = put_mode;
    }

    public String getRename_mode() {
        return rename_mode;
    }

    public void setRename_mode(String rename_mode) {
        this.rename_mode = rename_mode;
    }

    public String getCreate_mode() {
        return create_mode;
    }

    public void setCreate_mode(String create_mode) {
        this.create_mode = create_mode;
    }

    public Document_attribute getDocument_attribute() {
        return document_attribute;
    }

    public void setDocument_attribute(Document_attribute document_attribute) {
        this.document_attribute = document_attribute;
    }

    public Dialog_params getDialog_params() {
        return dialog_params;
    }

    public void setDialog_params(Dialog_params dialog_params) {
        this.dialog_params = dialog_params;
    }

    @Override
    public String toString() {
        return "Process{" +
                "document_path_type='" + document_path_type + '\'' +
                ", document_path_value='" + document_path_value + '\'' +
                ", error_handling='" + error_handling + '\'' +
                ", result_folder_path='" + result_folder_path + '\'' +
                ", indication_id='" + indication_id + '\'' +
                ", show_animation='" + show_animation + '\'' +
                ", delete_mode='" + delete_mode + '\'' +
                ", entry_type='" + entry_type + '\'' +
                ", folder_path_type='" + folder_path_type + '\'' +
                ", folder_path_value='" + folder_path_value + '\'' +
                ", page='" + page + '\'' +
                ", entry_file_path='" + entry_file_path + '\'' +
                ", entry_name='" + entry_name + '\'' +
                ", ext_id='" + ext_id + '\'' +
                ", put_mode='" + put_mode + '\'' +
                ", rename_mode='" + rename_mode + '\'' +
                ", create_mode='" + create_mode + '\'' +
                ", document_attribute=" + document_attribute +
                ", dialog_params=" + dialog_params +
                '}';
    }
}
