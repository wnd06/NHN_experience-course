package practice;

import java.util.function.BinaryOperator;

public class MathX {

    static double product(double i, double j) {
        return i * j;
    }

    // static double product(double... numbers) {
    // double result = 1;
    // for (double number : numbers) {
    // result = result * number;
    // }
    // return result;

    // }

    // fold-(right, left)
    static double reduce(BinaryOperation binaryOperation, double init, double... numbers) {
        return reduceIf(x -> true, binaryOperation, init, numbers);
    }

    static double reduceIf(Predicate predicate, BinaryOperation binaryOperation, double init,
            double... numbers) {
        double result = init;
        for (double number : numbers) { // Licskov's Substitution Principle = LSP
            if (predicate.apply(number))
                result = binaryOperation.apply(result, number);
        }
        return result;
    }

    static double product(double... numbers) {
        return reduce(new Multiply(), 1, numbers);
    }

    // sum :: int -> int
    static double sum(double n) { // Overloading
        return (n * (n + 1)) / 2;
    }

    // static int sum(int min, int max) {
    // return sum(max) - sum(min - 1);
    // }

    // sum :: (int, int) -> int
    // class meathod(?)
    static double sum(double... numbers) { // type signature
        double result = 0;
        // call by value 이나 건내준 값이 "주소값"이라 call by reference와 동일한 효과
        for (int index = 0; index < numbers.length; index++) { // result, indiex, numbers =
                                                               // local변수
            result = result + numbers[index]; // 매개변수 = Dynamic, 지역변수 = Static
        }
        return result;
    }

    static double reduce_sum(BinaryOperation binaryOperation, double init, double... numbers) {
        double result = init;
        for (double number : numbers) {
            result = binaryOperation.apply(result, number);
        }

        return result;
    }

    static double Sum(double... numbers) {
        return reduce_sum(new Multiply(), 0, numbers);
    }



}
