package entity;

import entity.entityutil.Process;

/**
 * POST /attribute/document/get请求实体
 * 这个包下都是完整的json对象，对象接口文档的每个请求（所有的post请求，put和delete请求没有进行封装）
 * 2017年8月30日10:07:08
 * qxz
 */
public class Attri_doc_get {

    private String priority;
    private String[] user_list;

    private Process process;

    public Attri_doc_get(){}

    public Attri_doc_get(String priority, String[] user_list, Process process) {
        this.priority = priority;
        this.user_list = user_list;
        this.process = process;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String[] getUser_list() {
        return user_list;
    }

    public void setUser_list(String[] user_list) {
        this.user_list = user_list;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    @Override
    public String toString() {
        return "Attri_doc_get{" +
                "priority='" + priority + '\'' +
                ", user_list='" + user_list + '\'' +
                ", process=" + process +
                '}';
    }
}
