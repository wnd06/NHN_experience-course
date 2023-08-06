package bokki;

public class FractionalTest {

    public static int[] fractional(int nume, int deno) {
        // 2단계 예외처리
        if (deno == 0) {
            throw new IllegalArgumentException("분모가 0입니다. 바꾸세요!");
        }
        return new int[] {nume, deno};
    }

    public static int nume(int[] r) { // r1 -> r -> r[0] = 1(분자), r[1] = 2(분모)
        normalize(r);
        return r[0];
    }

    public static int deno(int[] r) {
        normalize(r);
        return r[1];
    }

    private static int[] add(int[] r1, int[] r2) { // r1[0] == 1, r1[1] == 2, r2[0] == 4, r2[1] == 8
        return fractional(nume(r1) * deno(r2) + nume(r2) * deno(r1), deno(r1) * deno(r2));
    }

    private static void normalize(int[] r1) {
        int g = AllCase.gcd(r1[0], r1[1]);
        r1[0] = r1[0] / g;
        r1[1] = r1[1] / g;
    }

    private static String toString(int[] n) {
        String str = nume(n) + "/" + deno(n);
        return str;
    }

    public static void main(String[] args) {
        // 1단계 arguments 생성
        // int[] numbers = new int[args.length];
        // for (int i = 0; i < numbers.length; i++) {
        // numbers[i] = Integer.valueOf(args[i]);
        // }


        // 3단계 통분 하고 값 추출
        // int deno = numbers[1] * numbers[3];
        // int nume = numbers[0] * numbers[3] + numbers[2] * numbers[1];
        // System.out.println(nume + "/" + deno);
        // 4단계 add메서드에서 값 추출
        // int[] result = AllCase.add(numbers);
        // System.out.println(result[0] + "/" + result[1]);
        int[] x = fractional(1, 2);
        int[] y = fractional(2, 4);
        int[] w = fractional(4, 8);
        int[] z = fractional(5, 10);

        int[] num = add(fractional(x[0], x[1]), fractional(z[0], z[1]));
        // System.out.println(num[0]);

        System.out.println(toString(add(fractional(1, 2), fractional(4, 8))));


    }



}
