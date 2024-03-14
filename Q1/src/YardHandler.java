import javax.swing.*;

/**
 * A handler for converting data into yards. Passes data to the next handler if the input does not request
 * the conversion in Yards.
 */
public class YardHandler extends Handler {
    @Override
    public String handleRequest(double km, String targetUnit, JTextField outputField) {
        // If the target unit is Yard, convert the input kilometers to yards and display it
        if ("Yard".equalsIgnoreCase(targetUnit)) {
            double yards = km * 1093.61; // Conversion factor from kilometers to yards
//            outputField.setText(String.format("%.2f", yards)); // Display the converted value formatted to 2 decimal places
            return String.format("%s",yards);
        } else if (nextHandler != null) {
            // If the target unit is not Yard, pass the request to the next handler in the chain
            return nextHandler.handleRequest(km, targetUnit, outputField);
        }
        return "Invalid";
    }
}
