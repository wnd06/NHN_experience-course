package JAVA;

public class AddApp {
    public static void main(String[] args) {
        double[] numbers = new double[args.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Double.valueOf(args[i]);
        }

        System.out.println(Mathx.add(numbers));
        System.out.println(Mathx.add(1, 2, 3, 4));
        System.out.println(Mathx.sum_product(1,2,3));
        System.out.println(Mathx.<Double>reduce((x, y) -> x + y, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0));
    }

}
