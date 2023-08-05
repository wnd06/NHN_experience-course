package JAVA;

import java.util.function.BinaryOperator;

public class MultiplyApp {

    public static void main(String[] args) {
        int[] numbers = new int[args.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.valueOf(args[i]);
        }
        // 계산 하는 부분을 다른 Mathx로 넘긴다.


        System.out.println(Mathx.multiply(numbers));
        System.out.println(Mathx.multiply(1, 2, 3, 4));
        System.out.println(Mathx.product(1, 1,2,3));
        System.out.println(Mathx.<Integer>reduce((x, y) -> x * y, 1, 1, 2, 3, 4, 5));
    }

}
