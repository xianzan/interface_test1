package entity;

import entity.entityutil.Process;

import java.util.Arrays;

/**
 * POST /document/put请求实体
 */
public class ocument_put {

    private String[] user_list;
    private String priority;
    private Process process;
    public ocument_put(){};

    public ocument_put(String[] user_list, String priority, Process process) {
        this.user_list = user_list;
        this.priority = priority;
        this.process = process;
    }

    public String[] getUser_list() {
        return user_list;
    }

    public void setUser_list(String[] user_list) {
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

    @Override
    public String toString() {
        return "ocument_put{" +
                "user_list=" + Arrays.toString(user_list) +
                ", priority='" + priority + '\'' +
                ", Process=" + process +
                '}';
    }
}
