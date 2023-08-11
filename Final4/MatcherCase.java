package Final4;

public class MatcherCase {
    public static void main(String[] args) {

        Literal a = new Literal('a');
        Literal b = new Literal('b');
        Literal five = new Literal('5');
        Expression e = a.match(b.match(5));

        System.out.println(e.match("56a")); // -> false
    }
}
