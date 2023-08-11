package Final4;

public class Epsilon implements Expression {

     public static final Epsilon value = new Epsilon();

     private Epsilon() {}

    @Override
    public String toString() {
        return "ε";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public boolean Matcher() {
        return true;
    }
    
}
