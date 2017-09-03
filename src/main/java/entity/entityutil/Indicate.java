package entity.entityutil;

public class Indicate {

    private Dialog_params dialog_params;
    private String indication_id;
    private String show_animation;

    public Indicate(){}

    public Indicate(Dialog_params dialog_params, String indication_id, String show_animation) {
        this.dialog_params = dialog_params;
        this.indication_id = indication_id;
        this.show_animation = show_animation;
    }

    public Dialog_params getDialog_params() {
        return dialog_params;
    }

    public void setDialog_params(Dialog_params dialog_params) {
        this.dialog_params = dialog_params;
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

    @Override
    public String toString() {
        return "Indicate{" +
                "dialog_params=" + dialog_params +
                ", indication_id='" + indication_id + '\'' +
                ", show_animation='" + show_animation + '\'' +
                '}';
    }
}
