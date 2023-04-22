package util;

public class MsqResp {
    private Status status;
    private double value;

    public MsqResp(Status status, double value) {
        this.status = status;
        this.value = value;
    }
    
    public Status getStatus() {
        return status;
    }
    public double getValue() {
        return value;
    }

    
}
