package JAVA;

import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.Iterator;
import Calculater.practice.BinaryOperation;

public class Mathx implements BinaryOperation2<Integer> {

    public static double[] result(double result) { 
        if (result >= Double.MAX_VALUE)
            throw new IllegalArgumentException("두 수의 합이 최대를 넘겼습니다. 다시 설정해주세요.");
        // classInveriant();
        return new double[] {result};
    }

    public static double getResult (double result){

        return result;
    }


    public static double[] add(double...numbers) {

        double result = 0;

        for (double number : numbers) {
            result += number;
        }

        return result(getResult(result));
    }

    public static int add(int x, int y) {
        int result = 0;
        if (x < 0 || y < 0) 
            throw new IllegalArgumentException("더할 값들이 너무 작습니다.");
        return Math.addExact((int)x, (int)y);
    }


    public static int multiply(int... numbers) {
        int result = 1;

        for (int number : numbers) {
            result *= number;
        }

        return result;
    }

    public static <T> T reduce(BinaryOperator<T> binaryOperation2, T init, Iterator <T> iterator) {
        T result = init;
        T a = init;
        
        return result;
    }

    

    // public static <T> T product(T init, T... numbers) {
    //     BinaryOperator<T> b = (x, y) -> x * y;
    //     return reduce(b, init, numbers);
    // }

    // public static double sum_product(double...numbers) {
    //     return reduce(new Add(), 0, numbers);
    // }





}
