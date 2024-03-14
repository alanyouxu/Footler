import javax.swing.*;

public abstract class Handler {

    public Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    abstract String handleRequest(double km, String targetUnit, JTextField outputField);
}

