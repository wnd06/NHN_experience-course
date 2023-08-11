package Calculater.practice;

import java.util.ArrayList;
import java.util.function.Predicate;

// 1. 유리수 덧셈 유리수 4개 정수를 받는다 main -> Argument로 받는다. 제약 -> 2. 에러처리 생략 정수의 양식에 맞다면 그냥 값을 ,return
// 3. 통분하는 클래스 작성 그리고 return 값을 배열로 return 4. gcd 메서드 작성 후 적용
// 5. 예외처리 함수를 새로운 메서드에 적용 6. getter(selector) 작성 7.
public class FractionalTest {
    private FractionalTest() {}

    public static void main(String[] args) {
        Fractional F = new Fractional(1, 3);
        System.out.println(F.add(F));

        Fractional[] rs = {new Fractional(1, 2), new Fractional(2, 4), new Fractional(4, 8),
                new Fractional(5, 10)};
        ArrayList <Fractional> list = new ArrayList<>();
        list.add(new Fractional(1,2));
        for (Fractional r : rs) { // r로 Fractional 객체 가져옴. rs의 있는 값으로 add에 값 저장. -> Fractional r = new Fractional(1, 2);

            System.out.println(r.add(r));
            // System.out.println(r.intValue());
            // Predicate<Fractional> ok = x -> true;
        }
        System.out.println(MathX.<String>reduceIf(x -> true, (s, s2) -> s + s2, "", "a", "b", "c"));
        System.out.println(MathX.<String>reduce((s, s2) -> s + s2, "", "a", "b", "c"));
        // Fractional r = rs[0];
        // Object e = rs[1];
        // r.equals(e);

    }

    // 예외처리
    public static void classInveriant() {
        try {
            Fractional F = new Fractional(0, 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
    }

}
