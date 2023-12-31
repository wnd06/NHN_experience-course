package Calculater.practice;

public  class Multiply <T> implements BinaryOperation {

    @Override
    public Number apply(Number x, Number y) {
        Class<? extends Number> cls = x.getClass();

        if (cls == Integer.class) {
            return (Number) Integer.valueOf(x.intValue() * y.intValue());
        }

        else if (cls == Double.class) {
            return (Number) Double.valueOf(x.doubleValue() * y.doubleValue());
        }

        throw new UnsupportedOperationException("unknown class: " + cls);

    }

}
