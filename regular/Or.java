package regular;
//BinaryOperation의 subClass 이다.
public final class Or extends BinaryOperation{

    public Or(Expression left, Expression right) {
        //super(left, "|", right);
        super(left, right);
      }

    @Override
    public String getOperator() {
        return "|";
    }

}
