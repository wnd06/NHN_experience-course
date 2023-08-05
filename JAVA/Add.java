package JAVA;

public class Add implements BinaryOperation2<Double> {

    @Override
    public Double apply(Double x, Double y) {
        return x + y;
    }

}
