import javax.swing.*;

public abstract class DistanceDecorator extends Handler {
    protected Handler distance;
    public DistanceDecorator(Handler distance)
    {
        this.distance = distance;
    }

    public String handleRequest(double km, String targetUnit, JTextField outputField) {
        // Delegate handling to the decorated handler
        String originalDistance = distance.handleRequest(km, targetUnit, outputField);
        return decorateDistance(originalDistance, targetUnit);
    }

    public abstract String decorateDistance(String originalDistance, String targetUnit);
}
