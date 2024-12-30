package ec.com.sofka.model;

public class ErrorMessage {
    private String error;
    private String proccess;
    private String date;

    public ErrorMessage() {
    }

    public ErrorMessage(String error, String proccess, String date) {
        this.error = error;
        this.proccess = proccess;
        this.date = date;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getProccess() {
        return proccess;
    }

    public void setProccess(String proccess) {
        this.proccess = proccess;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}