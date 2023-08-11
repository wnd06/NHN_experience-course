package Final4;

public class Literal implements Expression {
    private char c;

    public Literal(char c) {
        this.c = c;
    }

    public char getC() {
        return c;
    }

    @Override
    public String toString() {
        return "" + getC();
    }

    public void accept(Visitor v){
        v.visit(this);
    }
    
}
