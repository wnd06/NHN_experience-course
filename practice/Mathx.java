package practice;

public class Mathx {
    private Mathx() {}


    public static int fibonacci(int n) {
        if (n < 0)
            throw new IllegalArgumentException("fibonacci: n < 0"); // --> preCondition

        if (n == 0) // 계산이 끝나는 지점 base condition
            return 0;
        else if (n == 1)
            return 1;
        return Math.addExact(fibonacci(n - 1), fibonacci(n - 2)); // --> postConditon
        // int[] arr = new int[n + 1];
        // arr[0] = 0;
        // arr[1] = 1;
        // for (int i = 2; i <= arr.length; i++) {
        // arr[i] = arr[i - 1] + arr[i - 2];
        // }
        // return arr[n];
    }

    public static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("factorial: n < 0");
        if (n == 0)
            return 1;
        return Math.multiplyExact(n, factorial(n - 1));
    }

}
