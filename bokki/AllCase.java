package bokki;

public class AllCase {

    static double reduce(BinaryOperation binaryOperation, double init, double... numbers) {

        return reduceIf(x -> true, binaryOperation, init, numbers);

    }

    static double reduceIf(Predicate predicate, BinaryOperation binaryOperation, double init,
            double... numbers) {
        double result = init;

        for (double number : numbers) {
            if (predicate.number(number)) {
                result = binaryOperation.apply(result, number);
            }
        }
        return result;

    }

    static double product(BinaryOperation binaryOperation, double init, double... numbers) {
        return reduce(new Multiply(), init, numbers);
    }

    static double product(double... numbers) {
        double result = 1;
        for (double number : numbers) {
            result = result * number;
        }
        return result;
    }

    static double multiply(double i, double j) {
        return i * j;
    }

    public static double sum_reduce(BinaryOperation binaryOperation, double init,
            double... numbers) {

        double result = init;

        for (double number : numbers) {
            result = binaryOperation.apply(result, number);
        }
        return result;
    }

    public static double sum_product(BinaryOperation binaryOperation, double init,
            double... number) {
        return sum_reduce(new Plus(), 0, number);
    }

    public static double sum_product(double... numbers) {
        double result = 0;
        for (double number : numbers) {
            result = result + number;
        }
        return result;
    }

    public static double sum(double i, double j) {
        return i + j;
    }

    public static char[] reduceIf(int i, Predicate predicate, BinaryOperation a, int j, int k,
            int l, int m, int n, int o, int p) {
        return null;
    }

}
