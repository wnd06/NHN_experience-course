package regular;

public final class Then extends BinaryOperation{

    public Then(Expression left, Expression right) {
        //super(left, "", right);
        super(left, right);
      }

    @Override
    public String getOperator() {
        return "";
    }
    
}
