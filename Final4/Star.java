package Final4;

public class Star implements Expression{
    Expression e;
    public Star(Expression e) {
        this.e = e;
    }
    
    public Expression getE() {
        return e;
    }

    public String getOperator() {
        return "*";
    }

    @Override
    public String toString() {
        return "(" + getE().toString() + ")" + getOperator();
    }

    public void accept(Visitor v){
        v.visit(this);
    }
}
