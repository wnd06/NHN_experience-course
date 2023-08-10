package usecases;
import regular.*;

public class HowToUsePrintableForm {
    public static void main(String[] args) {
        Literal a = new Literal( 'a' );
        Literal b = new Literal( 'b' );
        
        Expression a_ab = a.or( a.then( b ) );
        Expression ba_a0n = b.then( a ).or( Expression.epsilon.or( a.star() ) );

        System.out.println( PrintableForm.of( a_ab ) );
        System.out.println( PrintableForm.of( ba_a0n ) );
    }
}
