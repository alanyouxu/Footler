import java.text.DecimalFormat;
public class ExponentialDecorator extends DistanceDecorator {
    public ExponentialDecorator(Handler distance) {

        super(distance);
    }

    public String decorateDistance(String originalDistance, String targetUnit) {
        try {
            double toConvert = Double.parseDouble(originalDistance);
            return String.format("%e", toConvert);
        }
        catch (NumberFormatException e) {
            return "not a valid number";
        }
    }
}


//        try {
//            double value = Double.parseDouble(text);
//            distance.print(String.format("%.2f",value));
//        } catch (NumberFormatException e) {
//            distance.print("not a valid number");
//        }