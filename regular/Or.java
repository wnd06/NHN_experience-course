package regular;
//BinaryOperation의 subClass 이다.
public final class Or extends BinaryOperation implements Expression { //코드를 긁어오고 조건 만족

    public Or(Expression left, Expression right) {
        super(left, "|", right);
        // super(left, "|", right);
        
      }

    @Override
    public String getOperator() {
        return "|";
    }

}
