package entity.entityutil;

import java.util.Arrays;

/**
 * 这个包下都是key（对象）的bean，用于组装完整的json对象
 * 2017年8月30日10:09:12
 * qxz
 */
public class Action_entry {

    private String index;
    private String[] performers;

    private By_user by_user;

    public  Action_entry(){}

    public Action_entry(String index, String[] performers, By_user by_user) {
        this.index = index;
        this.performers = performers;
        this.by_user = by_user;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String[] getPerformers() {
        return performers;
    }

    public void setPerformers(String[] performers) {
        this.performers = performers;
    }

    public By_user getBy_user() {
        return by_user;
    }

    public void setBy_user(By_user by_user) {
        this.by_user = by_user;
    }

    @Override
    public String toString() {
        return "Action_entry{" +
                "index='" + index + '\'' +
                ", performers=" + Arrays.toString(performers) +
                ", by_user=" + by_user +
                '}';
    }
}
