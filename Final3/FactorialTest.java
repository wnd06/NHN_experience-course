package Final3;

public class FactorialTest {

    public static void baseCase() {
        if (Mathx.Factorial(0) == 1)
            return;
        System.exit(1);
    }

    public static void recursionCase() {
        int[][] answers = {{1, 1}, {7, 5040}, {4, 24}, {5, 120}, {9, 362880}};
        for (int[] answer : answers) {
            if(Mathx.Factorial(answer[0]) != answer[1])
            System.exit(1);
        }
        return;
    }

    public static void preCondition() {
        try {
            Mathx.Factorial(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.exit(1);
    }

    public static void postCondition() {
        try {
            Mathx.Factorial(Integer.MAX_VALUE);
        } catch(StackOverflowError s) {
            System.out.println("n의 값이 너무 큽니다.");
            return;
        } catch (ArithmeticException e){
            System.out.println("n의 값이 너무 큽니다.");
            return;
        }
        System.exit(1);
    }

    

}
