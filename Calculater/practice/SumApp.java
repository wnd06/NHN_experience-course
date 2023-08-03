package Calculater.practice;


public class SumApp { // name space
    // sum :: int -> int

    static int sum(int numbers) { // Overloading
        return ((numbers + 1) * numbers) / 2;
    }

    static double reduce(BinaryOperation binaryOperation, double init, double... numbers) { // type
                                                                                            // signature,
                                                                                            // numbers변수
                                                                                            // ->
                                                                                            // local
                                                                                            // variable
        double result = init;
        for (double number : numbers) {
            result = binaryOperation.apply(result, number);
        }
        return result;
    }

    // sum :: (int, int) -> int
    static double product(double... numbers) { // type signature, numbers변수 -> local variable
        return reduce(new Plus(), 0, numbers);
    }

    // 변수 = (이름, 값, 범위(scope, 시계), Type(저장 공간 크기, 값의 해석), Life Time(언제 만들어서 언제 사라지느냐)) 이름이(..)간추린다.
    // abstraction한다.
    // 변수의 속성을 정의한다 -> 묶는다. -> 바인딩한다.


    public static void main(String[] args) {
        // Heap - reference count
        System.out.println("args의 길이 : " + args.length);

        double[] numbers = new double[args.length];
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = Double.valueOf(args[j]);
        }
        System.out.println(product(numbers));
        System.out.println(product(1, 2, 3));
        System.out.println(sum(10) == product(1, 2, 3, 4, 5, 6, 7, 8, 10, 9));

        BinaryOperation plus = (x, y) -> x * y;
        System.out.println(MathX.reduce(plus, 1, 1, 2, 3, 4));
    }
}
