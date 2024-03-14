import javax.swing.*;
/**
 * A handler for converting data into Feet. Passes data to the next handler if the input does not request
 * the conversion in Feet.
 */
public class FootHandler extends Handler {
    @Override
    public String handleRequest(double km, String targetUnit, JTextField outputField) {
        // If the target unit is Foot, convert the input kilometers to feet and display it
        if ("Foot".equalsIgnoreCase(targetUnit)) {
            double feet = km * 3280.84; // Conversion factor from kilometers to feet

            return String.format("%s", feet); // Display the converted value formatted to 2 decimal places
        } else if (nextHandler != null) {
            // If the target unit is not Foot, pass the request to the next handler in the chain
            return nextHandler.handleRequest(km, targetUnit, outputField);
        }
        return "Invalid";
    }
}
