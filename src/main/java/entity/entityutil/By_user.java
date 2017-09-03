package entity.entityutil;

public class By_user {

    public String caption;

    public Confirm_dialog_params confirm_dialog_params ;

    public  By_user(){}

    public By_user(String caption, Confirm_dialog_params confirm_dialog_params) {
        this.caption = caption;
        this.confirm_dialog_params = confirm_dialog_params;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Confirm_dialog_params getConfirm_dialog_params() {
        return confirm_dialog_params;
    }

    public void setConfirm_dialog_params(Confirm_dialog_params confirm_dialog_params) {
        this.confirm_dialog_params = confirm_dialog_params;
    }

    @Override
    public String toString() {
        return "By_user{" +
                "caption='" + caption + '\'' +
                ", confirm_dialog_params=" + confirm_dialog_params +
                '}';
    }
}
