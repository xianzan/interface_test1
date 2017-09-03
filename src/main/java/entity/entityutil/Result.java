package entity.entityutil;

public class Result {
    private Failure_dialog_params failure_dialog_params;
    private Success_dialog_params success_dialog_params;

    public Result(){}

    public Result(Failure_dialog_params failure_dialog_params, Success_dialog_params success_dialog_params) {
        this.failure_dialog_params = failure_dialog_params;
        this.success_dialog_params = success_dialog_params;
    }

    public Failure_dialog_params getFailure_dialog_params() {
        return failure_dialog_params;
    }

    public void setFailure_dialog_params(Failure_dialog_params failure_dialog_params) {
        this.failure_dialog_params = failure_dialog_params;
    }

    public Success_dialog_params getSuccess_dialog_params() {
        return success_dialog_params;
    }

    public void setSuccess_dialog_params(Success_dialog_params success_dialog_params) {
        this.success_dialog_params = success_dialog_params;
    }

    @Override
    public String toString() {
        return "Result{" +
                "failure_dialog_params=" + failure_dialog_params +
                ", success_dialog_params=" + success_dialog_params +
                '}';
    }
}
