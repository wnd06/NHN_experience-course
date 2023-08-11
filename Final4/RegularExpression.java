package Final4;


public class RegularExpression {
    public static void main(String[] args) {
        Literal a = new Literal('a');
        Literal b = new Literal('b');

        // Expression a_ab = new Or( a, new Then( a, b ) );
        // Expression ba_a0n = new Or( new Then( b, a ),
        // new Or( Expression.epsilon, new Star( a ) )
        // );
        Expression a_ab = a.or(a.then(b));
        Expression ba_a0n = b.then(a).or(Expression.epsilon.or(a.star()));

        System.out.println(a_ab);
        System.out.println(ba_a0n);  

    }
}
