package regular;

// patial implementation - inheritance
// implementation - representation
public interface Expression {

    public static final Epsilon epsilon = Epsilon.value;

    public default Expression or(Expression e) {
        return new Or(this, e);
    }
    public default Expression then(Expression e) {
        return new Then(this, e);
    }
    public default Expression star() {
        return new Star(this);
    }
    
    public void accept(Visitor visitor);
}