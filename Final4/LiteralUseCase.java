package Final4;

import usecases.Literals;

public class LiteralUseCase {
    public static void main(String[] args) {
        Literal a = new Literal( 'a' );
        Literal b = new Literal( 'b' );
        
        Expression a_ab = a.or( a.then( b ) );
        Expression ba_a0n = b.then( a ).or( Expression.epsilon.or( a.star() ) );

        System.out.println( a_ab );
        System.out.println( Final4.Literals.of(a_ab) );
        System.out.println( ba_a0n );
        System.out.println( Final4.Literals.of( ba_a0n ) );
    }
}
