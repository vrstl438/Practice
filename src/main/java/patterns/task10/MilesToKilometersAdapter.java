package patterns.task10;

public class MilesToKilometersAdapter implements Distance {
    private final Miles miles;

    private static final double MILES_TO_KM = 1.6;

    public MilesToKilometersAdapter(Miles miles) {
        this.miles = miles;
    }

    @Override
    public double getValue() {
        return miles.getValue() * MILES_TO_KM;
    }
}