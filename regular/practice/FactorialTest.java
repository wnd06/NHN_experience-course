package regular.practice;

import static regular.practice.Mathx.*;

public class FactorialTest {

    public static void baseCase() {
        assert factorial(0) == 1;
        return;
    }

    public static void recursionCase() {
        int[][] answers = {{6, 720}, {5, 120}, {4, 24}, {9, 362880}};
        for (int[] answer : answers) {
            assert (answer[0] == factorial(answer[1]));
        }
        return;
    }

    public static void preCondition() {
        try {
            factorial(-1);
        } catch (IllegalArgumentException e) {
            return;
        } catch (StackOverflowError s) {
            return;
        }
        assert false;
    }

    public static void postCondition() {
        try {
            factorial(Integer.MAX_VALUE);
        } catch (ArithmeticException e) {
            System.out.println("factorial: arithmetic overflow");
            return;
        } catch (StackOverflowError s) {
            System.out.println("factorial: stack overflow");
            return;
        }
        assert false;
    }

}
