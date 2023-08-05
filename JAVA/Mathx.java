package JAVA;

import java.util.function.BinaryOperator;
import Calculater.practice.BinaryOperation;

public class Mathx {


    public static int multiply(int... numbers) {
        int result = 1;

        for (int number : numbers) {
            result *= number;
        }

        return result;
    }

    public static double add(double... numbers) {
        double result = 0;

        for (double number : numbers) {
            result += number;
        }

        return result;
    }

    public static <T> T reduce(BinaryOperator<T> binaryOperation2, T init, T... numbers) {
        T result = init;
        for (T number : numbers) {
            result = binaryOperation2.apply(result, number);
        }
        return result;
    }

    public static <T> T product(T init, T... numbers) {
        BinaryOperator<T> b = (x, y) -> x* y;
        return reduce(b, init, numbers);
    }

    public static double sum_product(double...numbers) {
        return reduce(new Add(), 0, numbers);
    }





}
