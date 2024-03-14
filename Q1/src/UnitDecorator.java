//public class UnitDecorator extends DistanceDecorator {
//    private String unit;
//
//    public UnitDecorator(DistanceDecorator decoratedInput, String unit) {
//        super(decoratedInput.getFormattedOutput());
//        this.unit = unit;
//    }
//
//    @Override
//    public String getFormattedOutput() {
//        return input + " " + unit;
//    }
//}



public class UnitDecorator extends DistanceDecorator {
    public UnitDecorator(Handler distance) {
        super(distance);
    }

    public String decorateDistance(String originalDistance, String targetUnit) {
        try {
            if(targetUnit == "Foot") {
                return originalDistance + " Feet";
            }
            else {
                return originalDistance + " " + targetUnit + "s";
            }
        }
        catch (NumberFormatException e) {
            return "not a valid number";
        }
    }
}