package practice;

import static practice.Mathx.*;

public class FibonacciTest {

    public static void baseCase() {
        if (fibonacci(0) == 0 && fibonacci(1) == 1)
            return;
        System.exit(1);
    }

    public static void recursionCase() {
        // int[][] answers = {{5, 5}, {6, 8}, {9, 34}, {14, 377}};
        // for (int[] answer_2 : answers) {
        // if (answer_2[1] != fibonacci(answer_2[0]))
        // System.exit(1);
        // return;
        // }
        int[] answer = {0, 1, 1, 2, 3, 5};
        for (int index = 2; index <= answer.length; index++) {
            if (fibonacci(index) != answer[index])
                System.exit(2);
            return;
        }

    }

    public static void preCondition() {
        try {
            fibonacci(-1);
        } catch (IllegalArgumentException e) {
            return;
        }
        System.exit(1);
    }

    public static void postCondition() {
        try {
            fibonacci(Integer.MAX_VALUE);

        } catch (ArithmeticException e) {
            return;
        } catch (StackOverflowError s) {
            System.out.println("fibonacci: stack overflow");
            return;
        }
        System.exit(1);
    }

}
