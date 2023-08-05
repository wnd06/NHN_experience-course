package JAVA;

@FunctionalInterface
public interface BinaryOperation2 <T extends Number> {
    public T apply(T x, T y);
}
