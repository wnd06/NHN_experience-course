package bokki;

public class AddApp {

    public static void main(String[] args) {

        double[] numbers = new double[args.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Double.valueOf(args[i]);
        }

        System.out.println(AllCase.sum(10, 30));
        System.out.println(AllCase.sum_product(numbers));
        System.out.println(AllCase.sum_product(1, 2, 3, 4, 5));

        BinaryOperation a = (x, y) -> x * y;
        System.out.println(AllCase.product(a, 1, 1, 3, 5, 2));

        System.out.println(AllCase.multiply(1, 20));
        System.out.println(AllCase.product(numbers));
        System.out.println(AllCase.product(1, 2, 3, 4, 5));
        BinaryOperation b = (x, y) -> x + y;
        System.out.println(AllCase.sum_product(b, 0, 1, 2, 3, 4));

        System.out.println(AllCase.reduceIf(x -> x % 2 == 0, a, 1, 1, 2, 3, 4, 5, 6));
    }


}
