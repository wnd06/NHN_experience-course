package Final4;

public interface Expression {

    public static final Expression epsilon = Epsilon.value;

    public default Expression or (Expression e) {
        return new Or(this, e);
    }
    public default Expression then (Expression e) {
        return new Then(this, e);
    }
    public default Expression star () {
        return new Star(this);
    }

    public boolean Matcher ();
    public void accept(Visitor v);  
}
