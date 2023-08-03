package Calculater.practice;

// 인터페이스는 지켜할 조건을 작성한다
// 하나만 존재해야 한다.
@FunctionalInterface
public interface BinaryOperation {
    public double apply(double x, double y);
}

