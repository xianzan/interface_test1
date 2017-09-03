package util;

import com.google.gson.Gson;
import entity.*;
import entity.entityutil.*;
import entity.entityutil.Process;

/**
 * 功能：1.将对象转化为json格式字符串；
 *       2.将json格式的字符串转化为对象
 *       3.组装POST请求，响应客户端json格式的默认POST请求参数
 * 2017年8月30日10:20:21
 * qxz
 */
public class PackJson {
    public static String setjson(Object requestBody) {
        Gson gson = new Gson();

        return gson.toJson(requestBody);
    }

    public static Object getjson(String data, Class<?> file) {
        Gson gson = new Gson();

        return gson.fromJson(data, file);
    }

    public static String setAttributeDocumentGet() {
        Attri_doc_get attri_doc_get = new Attri_doc_get();
        attri_doc_get.setPriority("test");
        Process process = new Process();
        process.setDocument_path_type("file");
        process.setDocument_path_value("/d:/xx");
        process.setError_handling("123");
        process.setResult_folder_path("/d:/");
        attri_doc_get.setProcess(process);
        attri_doc_get.setUser_list(new String[]{"admin"});
        String result = PackJson.setjson(attri_doc_get);
        return "{\"result\":" + result + "}";
    }

    public static String setAttributeDocumentPut(){
        //1.构建action_entry
        By_user by_user = new By_user();
        by_user.setCaption("123");
        Confirm_dialog_params confirm_dialog_params = new Confirm_dialog_params();
        confirm_dialog_params.setMessage("123");
        confirm_dialog_params.setNegative_button_caption("321");
        confirm_dialog_params.setPositive_button_caption("123");
        by_user.setConfirm_dialog_params(confirm_dialog_params);
        // List<Action_entry> action_entry = (List<Action_entry>) new Action_entry();

        Action_entry action_entry = new Action_entry();
        action_entry.setBy_user(by_user);
        action_entry.setIndex("1");
        action_entry.setPerformers(new String[]{"123"});

        //2.构建action_performer
        // 2.1构建Indicate
        Dialog_params dialog_params = new Dialog_params();
        dialog_params.setButton_caption("123");
        dialog_params.setMessage("321");
        dialog_params.setTitle("123");
        Indicate indicate = new Indicate();
        indicate.setDialog_params(dialog_params);
        indicate.setIndication_id("123");
        indicate.setShow_animation("321");
        //2.2构建request
        Request request = new Request();
        request.setRestrict("123");
        request.setUrl("321");
        //2.3构建result
        Result result = new Result();
        Failure_dialog_params failure_dialog_params = new Failure_dialog_params();
        failure_dialog_params.setButton_caption("123");
        failure_dialog_params.setMessage("321");
        failure_dialog_params.setTitle("123");
        Success_dialog_params success_dialog_params = new Success_dialog_params();
        success_dialog_params.setButton_caption("321");
        success_dialog_params.setMessage("123");
        success_dialog_params.setTitle("321");
        result.setFailure_dialog_params(failure_dialog_params);
        result.setSuccess_dialog_params(success_dialog_params);
        //2.4组装action_performer
        Action_performer action_performer = new Action_performer();
        action_performer.setIndex("123");
        action_performer.setIndicate(indicate);
        action_performer.setRequest(request);
        action_performer.setResult(result);
        //3.构建document_attribute
        Document_attribute document_attribute = new Document_attribute();
        document_attribute.setAction_entry(new Object[]{action_entry});
        document_attribute.setAction_performer(new Object[]{action_performer});
        //4.构建process
        Process process = new Process();
        process.setDocument_attribute(document_attribute);
        process.setDocument_path_type("123");
        process.setDocument_path_value("321");
        process.setError_handling("123");
        //5.构建put请求
        Attri_doc_put attri_doc_put = new Attri_doc_put();
        attri_doc_put.setPriority("123");
        attri_doc_put.setProcess(process);
        attri_doc_put.setUser_list(new String[]{"321"});
        String result1 = PackJson.setjson(attri_doc_put);
        return "{\"result\":" + result + "}";

    }
    public static String setContr_config_date_format() {
        Contr_config_date_format contr_config_date_format = new Contr_config_date_format();
        contr_config_date_format.setError_handling("123");
        contr_config_date_format.setFormat("321");
        String result = PackJson.setjson(contr_config_date_format);
        return "{\"result\":" + result + "}";
    }

    public static String setContr_config_time_format() {
        Contr_config_time_format contr_config_time_format = new Contr_config_time_format();
        contr_config_time_format.setError_handling("123");
        contr_config_time_format.setFormat("321");
        String result = PackJson.setjson(contr_config_time_format);
        return "{\"result\":" + result + "}";
    }

    public static String setContr_config_timeout_to_sleep() {
        Contr_config_timeout_to_sleep contr_config_timeout_to_sleep = new Contr_config_timeout_to_sleep();
        contr_config_timeout_to_sleep.setError_handling("123");
        contr_config_timeout_to_sleep.setTimeout("321");
        String result = PackJson.setjson(contr_config_timeout_to_sleep);
        return "{\"result\":" + result + "}";
    }

    public static String setContr_log() {
        Contr_log contr_log = new Contr_log();
        contr_log.setError_handling("123");
        contr_log.setFile_name("321");
        String result = PackJson.setjson(contr_log);
        return "{\"result\":" + result + "}";
    }

    public static String setContr_register_wifi_accesspoint() {
        Contr_register_wifi_accesspoint contr_register_wifi_accesspoint = new Contr_register_wifi_accesspoint();
        contr_register_wifi_accesspoint.setDhcp("123");
        contr_register_wifi_accesspoint.setDns1("321");
        contr_register_wifi_accesspoint.setEap("123");
        contr_register_wifi_accesspoint.setEap_anid("312");
        contr_register_wifi_accesspoint.setEap_cacert("123");
        contr_register_wifi_accesspoint.setEap_cert("321");
        contr_register_wifi_accesspoint.setEap_id("123");
        contr_register_wifi_accesspoint.setEap_phase2("321");
        contr_register_wifi_accesspoint.setError_handling("123");
        contr_register_wifi_accesspoint.setGateway("321");
        contr_register_wifi_accesspoint.setNetwork_mask("123");
        contr_register_wifi_accesspoint.setPasswd("321");
        contr_register_wifi_accesspoint.setProxy("123");
        contr_register_wifi_accesspoint.setProxy_host("321");
        contr_register_wifi_accesspoint.setProxy_port("123");
        contr_register_wifi_accesspoint.setSecurity("321");
        String result = PackJson.setjson(contr_register_wifi_accesspoint);
        return "{\"result\":" + result + "}";
    }

    public static String setContr_update_firmware() {
        Contr_update_firmware contr_update_firmware = new Contr_update_firmware();
        contr_update_firmware.setError_handling("123");
        contr_update_firmware.setFile_name("321");
        String result = PackJson.setjson(contr_update_firmware);
        return "{\"result\":" + result + "}";
    }

    public static String setDevice_contents() {
        Device_contents device_contents = new Device_contents();
        device_contents.setPriority("123");
        Process process = new Process();
        process.setError_handling("123");
        process.setResult_folder_path("321");
        device_contents.setProcess(process);
        device_contents.setUser_list(new String[]{"123"});
        String result = PackJson.setjson(device_contents);
        return "{\"result\":" + result + "}";
    }

    public static String setDevice_indicate() {
        Device_indicate device_indicate = new Device_indicate();
        device_indicate.setPriority("123");
        Process process = new Process();
        Dialog_params dialog_params = new Dialog_params();
        dialog_params.setButton_caption("123");
        dialog_params.setMessage("312");
        dialog_params.setTitle("123");
        process.setDialog_params(dialog_params);
        process.setError_handling("312");
        process.setIndication_id("123");
        process.setShow_animation("321");

        device_indicate.setProcess(process);
        device_indicate.setUser_list(new String[]{"123"});
        String result = PackJson.setjson(device_indicate);
        return "{\"result\":" + result + "}";
    }

    public static String setDevice_screen_shot() {
        Device_screen_shot device_screen_shot = new Device_screen_shot();
        device_screen_shot.setPriority("123");
        Process process = new Process();
        process.setError_handling("123");
        process.setResult_folder_path("321");
        device_screen_shot.setProcess(process);
        device_screen_shot.setUser_list(new String[]{"123"});
        String result = PackJson.setjson(device_screen_shot);
        return "{\"result\":" + result + "}";
    }

    public static String setDevice_undicate() {
        Device_unindicate device_indicate = new Device_unindicate();
        device_indicate.setPriority("123");
        Process process = new Process();
        process.setError_handling("123");
        process.setResult_folder_path("321");
        device_indicate.setProcess(process);
        device_indicate.setUser_list(new String[]{"123"});
        String result = PackJson.setjson(device_indicate);
        return "{\"result\":" + result + "}";
    }

    public static String setDocument_delete() {
        Document_delete document_delete = new Document_delete();
        document_delete.setPriority("123");
        Process process = new Process();
        process.setDelete_mode("123");
        process.setDocument_path_type("321");
        process.setDocument_path_value("123");
        process.setError_handling("321");
        document_delete.setProcess(process);
        document_delete.setUser_list(new String[]{"123"});
        String result = PackJson.setjson(document_delete);
        return "{\"result\":" + result + "}";
    }

    public static String setDocument_get() {
        Document_get document_get = new Document_get();
        document_get.setPriority("123");
        Process process = new Process();
        process.setResult_folder_path("123");
        process.setDocument_path_type("321");
        process.setDocument_path_value("123");
        process.setError_handling("321");
        document_get.setProcess(process);
        document_get.setUser_list(new String[]{"123"});
        String result = PackJson.setjson(document_get);
        return "{\"result\":" + result + "}";
    }

    public static String setDocument_Info() {
        Document_Info document_info = new Document_Info();
        document_info.setPriority("123");
        Process process = new Process();
        process.setResult_folder_path("123");
        process.setDocument_path_type("321");
        process.setDocument_path_value("123");
        process.setError_handling("321");
        document_info.setProcess(process);
        document_info.setUser_list(new String[]{"123"});
        String result = PackJson.setjson(document_info);
        return "{\"result\":" + result + "}";
    }

    public static String setDocument_list() {
        Document_list document_list = new Document_list();
        document_list.setPriority("123");
        Process process = new Process();
        process.setEntry_type("321");
        process.setResult_folder_path("123");
        process.setDocument_path_type("321");
        process.setDocument_path_value("123");
        process.setError_handling("321");
        document_list.setProcess(process);
        document_list.setUser_list(new String[]{"123"});
        String result = PackJson.setjson(document_list);
        return "{\"result\":" + result + "}";
    }

    public static String setDocument_open() {
        Document_open document_open = new Document_open();
        document_open.setPriority("123");
        Process process = new Process();
        process.setPage("312");
        process.setDocument_path_type("321");
        process.setDocument_path_value("123");
        process.setError_handling("321");
        document_open.setProcess(process);
        document_open.setUser_list(new String[]{"123"});
        String result = PackJson.setjson(document_open);
        return "{\"result\":" + result + "}";
    }
    public static String setDocument_rename(){
        Document_rename document_rename = new Document_rename();
        document_rename.setPriority("123");
        Process process = new Process();
        process.setEntry_name("123");
        process.setDocument_path_type("321");
        process.setDocument_path_value("123");
        process.setError_handling("321");
        process.setRename_mode("123");
        document_rename.setProcess(process);
        document_rename.setUser_list(new String[]{"123"});
        String result = PackJson.setjson(document_rename);
        return "{\"result\":" + result + "}";
    }

    public static String setFolder_create(){
        Folder_create folder_create = new Folder_create();
        folder_create.setPriority("123");
        Process process = new Process();
        process.setCreate_mode("321");
        process.setEntry_name("123");
        process.setError_handling("231");
        process.setFolder_path_type("123");
        process.setFolder_path_value("321");
        process.setExt_id("321");
        folder_create.setProcess(process);
        folder_create.setUser_list(new String[]{"123"});
        String result = PackJson.setjson(folder_create);
        return "{\"result\":" + result + "}";
    }

    public static String setFolder_delete(){
        Folder_delete folder_delete = new Folder_delete();
        folder_delete.setPriority("123");
        Process process = new Process();
        process.setDelete_mode("321");
        process.setFolder_path_type("123");
        process.setFolder_path_value("132");
        process.setError_handling("321");

        folder_delete.setProcess(process);
        folder_delete.setUser_list(new String[]{"123"});
        String result = PackJson.setjson(folder_delete);
        return "{\"result\":" + result + "}";
    }

    public static String setFolder_rename(){
        Folder_rename folder_rename = new Folder_rename();
        folder_rename.setPriority("123");
        Process process = new Process();
        process.setEntry_name("213");
        process.setRename_mode("321");
        process.setFolder_path_type("123");
        process.setFolder_path_value("132");
        process.setError_handling("321");

        folder_rename.setProcess(process);
        folder_rename.setUser_list(new String[]{"123"});
        String result = PackJson.setjson(folder_rename);
        return "{\"result\":" + result + "}";
    }

    public static String setPOST_manage_devices(){
        POST_manage_devices post_manage_devices = new POST_manage_devices();
        post_manage_devices.setRegister_code("123");
        post_manage_devices.setSerial_number("321");
        String result =  PackJson.setjson(post_manage_devices);
        return "{\"result\":" + result + "}";
    }

    public static String setPut_manage_devices(){
        Put_manage_devices put_manage_devices = new Put_manage_devices();
        put_manage_devices.setIp_address("123");
        put_manage_devices.setUser_id("321");
        String result =  PackJson.setjson(put_manage_devices);
        return "{\"result\":" + result + "}";
    }

    public static String setPost_manage_license(){
        Post_manage_license post_manage_license = new Post_manage_license();
        post_manage_license.setLicense_code("123");
        String result =  PackJson.setjson(post_manage_license);
        return "{\"result\":" + result + "}";
    }

    public static String setPut_manage_queues(){
        Put_manage_queues put_manage_queues = new Put_manage_queues();
        put_manage_queues.setApi("123");
        put_manage_queues.setError_code("321");
        put_manage_queues.setPriority("123");
        put_manage_queues.setRequest_date("321");
        put_manage_queues.setRequest_id("231");
        put_manage_queues.setSerial_number("123");
        put_manage_queues.setStatus("321");
        put_manage_queues.setUser_id("123");
        String result =  PackJson.setjson(put_manage_queues);
        return "{\"result\":" + result + "}";
    }

}
