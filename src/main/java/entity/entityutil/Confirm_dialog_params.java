package entity.entityutil;

public class Confirm_dialog_params {

    public String message;
    public String negative_button_caption;
    public String positive_button_caption;
    public String title;

    public Confirm_dialog_params(){}

    public Confirm_dialog_params(String message, String negative_button_caption, String positive_button_caption, String title) {
        this.message = message;
        this.negative_button_caption = negative_button_caption;
        this.positive_button_caption = positive_button_caption;
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNegative_button_caption() {
        return negative_button_caption;
    }

    public void setNegative_button_caption(String negative_button_caption) {
        this.negative_button_caption = negative_button_caption;
    }

    public String getPositive_button_caption() {
        return positive_button_caption;
    }

    public void setPositive_button_caption(String positive_button_caption) {
        this.positive_button_caption = positive_button_caption;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Confirm_dialog_params{" +
                "message='" + message + '\'' +
                ", negative_button_caption='" + negative_button_caption + '\'' +
                ", positive_button_caption='" + positive_button_caption + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
