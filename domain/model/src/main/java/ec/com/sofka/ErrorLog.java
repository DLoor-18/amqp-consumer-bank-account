package ec.com.sofka;

public class ErrorLog {
    String error;
    String proccess;
    String timestamp;

    public ErrorLog(String error, String proccess, String timestamp) {
        this.error = error;
        this.proccess = proccess;
        this.timestamp = timestamp;
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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}