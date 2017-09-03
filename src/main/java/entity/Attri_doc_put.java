package entity;

import entity.entityutil.Process;

import java.util.Arrays;

/**
 *
 */
public class Attri_doc_put {

    private String priority;
    private String[] user_list;
    private Process process;

    public  Attri_doc_put(){}

    public Attri_doc_put(String priority, String[] user_list, Process process) {
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
        return "Attri_doc_put{" +
                "priority='" + priority + '\'' +
                ", user_list=" + Arrays.toString(user_list) +
                ", process=" + process +
                '}';
    }
}
