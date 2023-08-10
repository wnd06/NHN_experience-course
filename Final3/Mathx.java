package Final3;

public class Mathx {

    // 피보나치 계산...
    public static int Fibo(int n) {
        if (n < 0)
            throw new IllegalArgumentException("n의 값이 너무 작습니다."); // basecase
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return Fibo(n - 1) + Fibo(n - 2);
    }

    // 팩토리얼 계산...
    public static int Factorial(int n) {
        if (n < 0) // --> preCondition
            throw new IllegalArgumentException("n의 값이 너무 작습니다.");
        if (n == 0) // --> baseCase
            return 1;
        //System.out.println(n);
        int result = n * Factorial(n - 1);
        //System.out.println(n);
        return result;
    }
}
