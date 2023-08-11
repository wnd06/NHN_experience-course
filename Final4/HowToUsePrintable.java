package Final4;

import usecases.PrintableForm;

public class HowToUsePrintable {
    public static void main(String[] args) {
        Literal a = new Literal( 'a' );
        Literal b = new Literal( 'b' );
        
        Expression a_ab = a.or( a.then( b ) );
        Expression ba_a0n = b.then( a ).or( Expression.epsilon.or( a.star() ) );

        System.out.println( Final4.PrintableForm.of( a_ab ) );
        System.out.println( Final4.PrintableForm.of( ba_a0n ) );
    }
}
