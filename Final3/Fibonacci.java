package Final3;

public class Fibonacci {


    public static void main(String[] args) {

        FibonacciTest();
        
        System.out.println(Mathx.Fibo(7));

    }

    // Fibonacci TestCase !!
    private static void FibonacciTest() {
        FibonacciTest.baseCase();
        FibonacciTest.recursionCase();
        FibonacciTest.preCondition();
        FibonacciTest.postCondition();
    }
}
