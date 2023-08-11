package practice;

public class MathxTest {


    public static void main(String[] args) {
        MathxTest.fibonacciTest();

        MathxTest.factorialTest();
    }

    public static void fibonacciTest() {
        FibonacciTest.baseCase();
        FibonacciTest.recursionCase();
        FibonacciTest.preCondition(); // require
        FibonacciTest.postCondition(); // satisfy
    }

    public static void factorialTest() {
        FactorialTest.baseCase();
        FactorialTest.recursionCase();
        FactorialTest.preCondition();
        FactorialTest.postCondition();
    }

    private MathxTest() {} // default constructor
}
