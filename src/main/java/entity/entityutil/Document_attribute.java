package entity.entityutil;

/**
 * process的对象属性
 */
public class Document_attribute {

    private Object[] action_entry;
    private Object[] action_performer;

    public  Document_attribute(){}

    public Document_attribute(Object[] action_entry, Object[] action_performer) {
        this.action_entry = action_entry;
        this.action_performer = action_performer;
    }

    public Object[] getAction_entry() {
        return action_entry;
    }

    public void setAction_entry(Object[] action_entry) {
        this.action_entry = action_entry;
    }

    public Object[] getAction_performer() {
        return action_performer;
    }

    public void setAction_performer(Object[] action_performer) {
        this.action_performer = action_performer;
    }

    @Override
    public String toString() {
        return "Document_attribute{" +
                "action_entry=" + action_entry +
                ", action_performer=" + action_performer +
                '}';
    }
}
