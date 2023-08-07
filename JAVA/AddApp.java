package JAVA;

public class AddApp {


    private static String toString(double[] result) {
        String str = "result : " + result[0];
        return str;
    }

    public static void main(String[] args) {
        double[] numbers = new double[args.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Double.valueOf(args[i]);
        }

        System.out.println(toString(Mathx.add(numbers)));
        System.out.println(toString(Mathx.add(1, 2, 3, 4)));
        // System.out.println(Mathx.sum_product(1, 2, 3));
        System.out.println(Mathx.<Double>reduce((x, y) -> x + y, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0));
        System.out.println(Mathx.<Integer>reduce((x, y) -> x + y, 0, 1, 2, 3, 4, 5));
        System.out.println(toString(Mathx.add(1, 2, 3, 4, 5, 6)));
        
        // 객체를 만들어서 더하기
        System.out.println(Range.add(new Range(3, 5)));
        System.out.println(Range.add(new Range(4)));
    }



}
