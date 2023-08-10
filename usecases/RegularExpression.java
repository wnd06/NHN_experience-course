package usecases;

import regular.*;
public class RegularExpression {
    public static void main(String[] args) {
        Literal a = new Literal('a');
        Literal b = new Literal('b');
        // Expression a_ab = new Or( a, new Then( a, b ) );
        // Expression ba_a0n = new Or( new Then( b, a ), new Or(Expression.epsilon, new Star( a ) )
        // );
        // method cascading 방법 동일한 객체(a)에서 여러 메서드를 호출 할 수 있는 방법
        Expression a_ab = a.or(a.then(b));
        Expression ba_a0n = b.then(a).or(Expression.epsilon.or(a.star()));
        System.out.println(a_ab);
        System.out.println(Literals.of(a_ab));
        System.out.println(ba_a0n);
        System.out.println(Literals.of(ba_a0n));

    }
}
