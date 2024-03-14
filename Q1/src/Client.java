import javax.swing.*;

public class Client {

    public static void convert(JTextField inputField, String outputUnit, JTextField outputField) {
        // Create the chain of handlers
        Handler mileHandler = new MileHandler();
        Handler yardHandler = new YardHandler();
        Handler footHandler = new FootHandler();

        mileHandler.setNextHandler(yardHandler);
        yardHandler.setNextHandler(footHandler);
//
        try {
            double km = Double.parseDouble(inputField.getText());
            if (km < 0) {
                outputField.setText("Please enter a positive number.");
                return;
            }

            // create chain of decorators
            DistanceDecorator decoratedHandler = new UnitDecorator(new ExponentialDecorator(new RoundDecorator(mileHandler)));


            final String output = decoratedHandler.handleRequest(km, outputUnit,outputField);
            outputField.setText(output);



        } catch (NumberFormatException e) {
            outputField.setText("Invalid input. Please enter a valid number.");
        }
    }

    // TODO: Define Decorator base class and concrete decorators here

}