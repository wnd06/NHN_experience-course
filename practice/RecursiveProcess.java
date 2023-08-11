package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Stack;

public class RecursiveProcess {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 3;
        System.out.println("factorial" + "(" + n + ")");
        System.out.println(factorial(n));

    }

    static int[] arr;

    static int factorial(int n) {
        if (n == 0) {
            System.out.println("factorial" + "(" + n + ")" + " = " + "1");
            return 1;
        }

        int m = n - 1;
        System.out.println(n + "*" + "factorial" + "(" + m + ")");
        int result = n * factorial(n - 1);
        System.out.println(n + "*" + "factorial" + "(" + m + ")");
        return result;
    }

}
