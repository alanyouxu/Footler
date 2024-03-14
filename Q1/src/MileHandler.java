import javax.swing.*;
/**
 * A handler for converting data into Miles. Passes data to the next handler if the input does not request
 * the conversion in Miles.
 */
public class MileHandler extends Handler {
    @Override
    public String handleRequest(double km, String targetUnit, JTextField outputField) {
        if ("Mile".equalsIgnoreCase(targetUnit)) {
            double miles = km * 0.621371;
            return String.format("%s", miles);
        } else if (nextHandler != null) {

            return nextHandler.handleRequest(km, targetUnit, outputField);
        }

        return "Invalid";
    }
}