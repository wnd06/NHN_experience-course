package Calculater.practice;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.Iterator;

public class MathX {

    static double product(double i, double j) {
        return i * j;
    }

    // static double product(double... numbers) {
    // double result = 1;
    // for (double number : numbers) {
    // result = result * number;
    // }
    // return result;
    // 최민영 최고
    // }

    // fold-(right, left)
    static <T> T reduce(BinaryOperator<T> binaryOperation, T init, Iterator<T> iterator) { // 배열말고
                                                                                           // iterator
        return reduceIf(x -> true, binaryOperation, init, iterator);
    }

    // value semantics
    static <T> T reduceIf(Predicate<T> predicate, BinaryOperator<T> binaryOperation, T init,
            Iterator<T> iterator) {
        T result = init;
        while (iterator.hasNext()) {
            T i = iterator.next();
            if (predicate.test(i))
                result = binaryOperation.apply(i, result);
        }

        return result;
    }

    static <T> T product(Iterator<T> iterator,T init) {
        
        return reduce(new Multiply(), init, iterator);
        // 이중민 존나멋짐
    }

    // sum :: int -> int
    static double sum(double n) { // Overloading
        return (n * (n + 1)) / 2;
        // 백준잣밥쓰
    }

    static int sum(Range range) {
        return (int) (sum(range.getUpperBound()) - sum(range.getLowerBound() - 1)); // upperBound 범위
                                                                                    // 중
                                                                                    // 가장
                                                                                    // 큰 값
    }

    // sum :: (int, int) -> int
    // class meathod(?)
    static double sum(double... numbers) { // type signature
        double result = 0;
        // call by value 이나 건내준 값이 "주소값"이라 call by reference와 동일한 효과
        for (int index = 0; index < numbers.length; index++) { // result, indiex, numbers =
                                                               // local변수
            result = result + numbers[index]; // 매개변수 = Dynamic, 지역변수 = Static
        }
        return result;
    }

    static <T> T reduce_sum(BinaryOperation binaryOperation, T init, Iterator<T> iterator) {
        T result = init;
        while(iterator.hasNext()) {
            result = (T) binaryOperation.apply((Number)result, (Number)iterator.next());
        }
        return result;
    }

    static <T> T Sum(Iterator<T> iterator, T init) {
        return reduce_sum(new Multiply(), init, iterator);
    }



}
// value simetics, reference simetics -> equaliti
