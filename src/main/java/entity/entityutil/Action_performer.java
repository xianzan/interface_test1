package entity.entityutil;

public class Action_performer {

    private String index;
    private Indicate indicate;
    private Request request;
    private Result result;

    public Action_performer(){}

    public Action_performer(String index, Indicate indicate, Request request, Result result) {
        this.index = index;
        this.indicate = indicate;
        this.request = request;
        this.result = result;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Indicate getIndicate() {
        return indicate;
    }

    public void setIndicate(Indicate indicate) {
        this.indicate = indicate;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Action_performer{" +
                "index='" + index + '\'' +
                ", indicate=" + indicate +
                ", request=" + request +
                ", result=" + result +
                '}';
    }
}
