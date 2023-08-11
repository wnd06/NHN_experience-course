package Final4;

public final class Or extends BinaryOperation implements Expression {
    
    public Or(Expression left, Expression right) {
        super(left, "|", right);
    }


    @Override
    public String toString() {
        return "(" + getLeft().toString() + getOperator() + getRight().toString() + ")";
    }

    public boolean match() {
        Class <? extends Number> cls = (Class<? extends Number>) getLeft().getClass();
        if(cls == Integer.class)
        return true;
    }

    public void accept(Visitor v){
        v.visit(this);
    }
}
