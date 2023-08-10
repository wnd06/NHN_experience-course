package regular;

public final class Then extends BinaryOperation implements Expression{

    public Then(Expression left, Expression right) {
        super(left, "", right);
        //super(left, right);
      }

    // @Override
    // public String getOperator() {
    //     return "";
    // }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
}
