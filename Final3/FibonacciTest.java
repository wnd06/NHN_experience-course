package Final3;

public class FibonacciTest {
    public static void baseCase() {
        if (Mathx.Fibo(0) == 0 && Mathx.Fibo(1) == 1)
            return;
        System.exit(1);

    }

    public static void recursionCase() {
        int[][] answers = {{0, 0}, {1, 1}, {7, 13}, {9, 34}, {12, 144}};
        for (int[] answer : answers) {
            if (Mathx.Fibo(answer[0]) != answer[1]) {
                System.exit(1);
                return;
            }
        }
    }

    public static void preCondition() {
        try {
            Mathx.Fibo(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.exit(1);
    }

    public static void postCondition() {
        try {
            Mathx.Fibo(Integer.MAX_VALUE);
        } catch (StackOverflowError s) {
            System.out.println("n의 들어가는 숫자가 너무 큽니다!!");
            return;
        } catch (ArithmeticException e) {
            System.out.println("수가 너무 큽니다.");
            return;
        }
        System.exit(1);
    }
}
