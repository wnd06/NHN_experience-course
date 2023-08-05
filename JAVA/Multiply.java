package JAVA;

public class Multiply implements BinaryOperation2<Integer> {

    @Override
    public Integer apply(Integer x, Integer y) {
        return x * y;
    }

}
