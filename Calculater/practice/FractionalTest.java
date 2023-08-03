package Calculater.practice;

// 유리수 덧셈 유리수 4개 정수를 받는다 main -> Argument로 받는다. 제약 -> 에러처리 생략 정수의 양식에 맞다면 그냥
// 양수 음수 구분 -> 0. 2번째 4번째 분모 1번째 3번째 분자 1. 문자열로 받는다. 2. 문자열에서 양, 음 구분, 3.
public class FractionalTest {
    private FractionalTest() {}

    public static int[] fractional(int numerator, int denomiator) {
        if (denomiator == 0)
            throw new IllegalArgumentException("분모가 0이야!!");
        // int[] rep = new int[] {numerator, denomiator};
        // 기약분수가 된다.
        // classInvariant(rep);
        return new int[] {numerator, denomiator};
    }

    private static int gcd(int numerator, int denomiator) {

        while (denomiator != 0) {
            int swap = denomiator;
            denomiator = numerator % denomiator;
            numerator = swap;
        }

        return numerator;
    }

    private static void normalize(int[] r) {
        int g = gcd(r[0], r[1]);
        r[0] = r[0] / g;
        r[1] = r[1] / g;
    }

    public static int numerator(int[] r) {
        normalize(r); // 분자
        return r[0];
    }

    public static int denomiator(int[] r) { // 분모
        normalize(r);
        return r[1];
    }

    public static int[] add(int[] r1, int[] r2) {
        return fractional(numerator(r1) * denomiator(r2) + numerator(r1) * denomiator(r2),
                denomiator(r1) * denomiator(r2));
    }

    private static String toString(int[] r) {
        String str = numerator(r) + "/" + denomiator(r);
        return str;
    }

    public static boolean equals(int[] x, int[] y) {
        return numerator(x) == numerator(y) && denomiator(x) == denomiator(y);
    }

    public static void main(String[] args) {

        int[][] rs = {fractional(1, 2), fractional(2, 4), fractional(4, 8), fractional(5, 10)};

        // add(fractional(1, 2), fractional(4, 8));
        for (int[] r : rs) {
            System.out.println(toString(r));
        }
    }

}
