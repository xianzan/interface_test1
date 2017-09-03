package entity.entityutil;

public class Request {
    private String restrict;
    private String url;

    public Request(){}

    public Request(String restrict, String url) {
        this.restrict = restrict;
        this.url = url;
    }

    public String getRestrict() {
        return restrict;
    }

    public void setRestrict(String restrict) {
        this.restrict = restrict;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Request{" +
                "restrict='" + restrict + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
