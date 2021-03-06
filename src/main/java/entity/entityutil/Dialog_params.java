package entity.entityutil;

public class Dialog_params {
    private String button_caption;
    private String message;
    private String title;

    public Dialog_params(){}

    public Dialog_params(String button_caption, String message, String title) {
        this.button_caption = button_caption;
        this.message = message;
        this.title = title;
    }

    public String getButton_caption() {
        return button_caption;
    }

    public void setButton_caption(String button_caption) {
        this.button_caption = button_caption;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
