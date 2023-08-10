package Final;

import java.util.Iterator;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import bokki.Multiply;

public class Mathx {

    public static <T> T reduce(BinaryOperator<T> binaryOperation, T init, Iterator<T> iterator) {
        return reduceIf(x -> true, binaryOperation, init, iterator);
    }

    public static <T> T reduceIf(Predicate predicate, BinaryOperator<T> binaryOperator, T init, Iterator<T> iterator) {
        T result = init;
        while(iterator.hasNext()) {
            T i = iterator.next();
            if(predicate.test(i))
            result = binaryOperator.apply(result, i);
        }
        return result;
    }

    //더하기
    public static <T> T product(Iterator<T> iterator, T init) {
        return Sum_product(new Add(), init, iterator);
    }

    private static <T> T Sum_product(BinaryOperation binaryOperation, T init, Iterator<T> iterator) {
        T result = init;
        while(iterator.hasNext()) {
            result = (T) binaryOperation.apply((Number) result, (Number)iterator.next());
        }
        return result;
    }

    //곱하기
    public static <T> T m_Product(Iterator<T> iterator, T init) {
        return multiply_Product(new Final.Multiply(), init, iterator);
    }

    private static <T> T multiply_Product(BinaryOperation binaryOperation, T init, Iterator<T> iterator) {
        T result = init;
        while(iterator.hasNext()) {
            result = (T) binaryOperation.apply((Number) result, (Number)iterator.next());
        }
        return result;
    }

}
