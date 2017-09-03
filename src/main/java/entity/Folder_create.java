package entity;

import entity.entityutil.Process;

import java.util.Arrays;

public class Folder_create {
    private String priority;
    private Process process;
    private String[] user_list;

    public  Folder_create(){}

    public Folder_create(String priority, Process process, String[] user_list) {
        this.priority = priority;
        this.process = process;
        this.user_list = user_list;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public String[] getUser_list() {
        return user_list;
    }

    public void setUser_list(String[] user_list) {
        this.user_list = user_list;
    }

    @Override
    public String toString() {
        return "Folder_create{" +
                "priority='" + priority + '\'' +
                ", process=" + process +
                ", user_list=" + Arrays.toString(user_list) +
                '}';
    }

}
