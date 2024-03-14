


public class RoundDecorator extends DistanceDecorator {
    public RoundDecorator(Handler distance) {
        super(distance);
    }

    public String decorateDistance(String originalDistance, String targetUnit) {
        try {
            double toConvert = Double.parseDouble(originalDistance);
            System.out.println(String.format("%.2f", toConvert));
            return String.format("%.2f", toConvert);
        }
        catch (NumberFormatException e) {
            return "not a valid number";
        }
    }
}