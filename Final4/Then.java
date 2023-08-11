package Final4;

public final class Then extends BinaryOperation implements Expression {


    public Then(Expression left, Expression right) {
        super(left, "", right);
    }
    
    @Override
    public String toString() {
        return "(" + getLeft().toString() + getOperator() + getRight().toString() + ")";
    }
    public void accept(Visitor v){
        v.visit(this);
    }
}
