package Calculater.practice;

public final class Plus implements BinaryOperation<Integer> {

    @Override
    public Integer apply(Integer x, Integer y) {
        return x + y;
    }

    

}
