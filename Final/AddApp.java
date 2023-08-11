package Final;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class AddApp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Double> list2 = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(11);

        list2.add(2.0);
        list2.add(5.0);
        Iterator<Integer> iterator = list.iterator();
        Iterator<Integer> iterator2 = list.iterator();
        Iterator<Integer> iterator3 = list.iterator();
        Iterator<Double> iterator4 = list2.iterator();
        Iterator<Double> iterator5 = list2.iterator();
        Iterator<Double> iterator6 = list2.iterator();

        Predicate<Integer> p = x -> { // 소수 구별 람다식, Predicate는 return을 false/true
            if (x <= 1)
                return false;
            for (int i = 2; i < x; i++) {
                if (x % i == 0)
                    return false;
            }
            return true;
        };
        Predicate<Integer> p1 = p.negate(); // 원래의 람다식의 반대 결과 출력

        // 더하기 구간
        System.out.println(Mathx.reduce((x, y) -> x + y, 0, iterator));
        System.out.println(Mathx.reduceIf(p, (x, y) -> x + y, 0, iterator2));
        System.out.println(Mathx.product(iterator3, 0));

        // 곱하기 구간
        System.out.println(Mathx.reduce((x, y) -> x * y, 1.0, iterator4));
        System.out.println(Mathx.reduceIf(x -> true, (x, y) -> x * y, 1.0, iterator5));
        System.out.println(Mathx.m_Product(iterator6, 1.0));

    }
}
