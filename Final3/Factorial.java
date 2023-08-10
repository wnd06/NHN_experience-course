package Final3;

public class Factorial {
    public static void main(String[] args) {

        FactorialTest();

        System.out.println(Mathx.Factorial(4));
    }

    private static void FactorialTest() {
        FactorialTest.baseCase();
        FactorialTest.recursionCase();
        FactorialTest.preCondition();
        FactorialTest.postCondition();
    }

    
}
