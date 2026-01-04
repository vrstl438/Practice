package patterns.task10;

public class Kilometers implements Distance{
    private final double kilometers;

    public Kilometers(double kilometers){
        this.kilometers = kilometers;
    }

    @Override
    public double getValue(){
        return kilometers;
    }
}
