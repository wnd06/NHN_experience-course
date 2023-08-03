package Calculater.practice;


public class MathxTest extends MathX { // 상수값 선언 = final ex public final class PrintArgs


    // 변수 = (이름 , 값, 범위(scope), Type(저장 공간 크기, 값의 해석), life time)
    // 이름이 남직 속성들을 간추린다. abstraction 한다.
    // 속성의 결정 = binding (Static binding, Dynamic binding)
    public static void main(String[] args) {
        MathxTest.testRange();
        // Heap - reference count
        // double[] numbers = new double[args.length];

        // for (int index = 0; index < args.length; index++) {
        // numbers[index] = Double.valueOf(args[index]);
        // }
        // System.out.println(sum(1, 2, 3));
         //System.out.println(sum(numbers));
         System.out.println(sum(new Range(10)));
         System.out.println(sum(new Range(0, 10)));
         System.out.println(sum(new Range(5, 10)));
        // System.out.println(sum(5) == sum(1, 2, 3, 4, 5));
        // System.out.println(Sum(1, 2, 3, 4, 5, 6));

        // BinaryOperation plus = (x, y) -> x + y;
        // System.out.println(MathX.reduce(plus, 0, 1, 2, 3, 4));

        // BinaryOperation multiply = (x, y) -> x * y;
        // System.out.println(MathX.reduce(multiply, 1, 1, 2, 3, 4, 5));

        // System.out.println(product(2, 10));

        // // -----------------------------------------------------------------------
        // System.out.println("-----------------------------------------------------------------------");
        // // 입력하여 곱
        // double[] number = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        // System.out.println(product(number));

        // // 입력받아 곱
        // double[] arr = new double[args.length];
        // int index = 0;
        // for (String numberal : args) {
        // arr[index] = Double.valueOf(numberal);
        // index++;
        // }
        // System.out.println(product(arr));


        // // 입력하여 곱
        // System.out.println(product(4, 5, 6));
        // System.out.println(product(3, 4, 5, 6, 123));
        // System.out.println(product(1, 2, 3, 4, 5));
        // System.out.println(MathX.reduceIf(x -> x % 2 == 0, (x, y) -> x * y, 1, 1, 2, 3, 4, 5,
        // 6));
    
    }

    

    private static void testRange() {
        RangeTest.classInveriant();

    }

}
