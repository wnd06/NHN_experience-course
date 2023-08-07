package regular;

abstract class BinaryOperation implements Expression {
    private Expression right;
    private Expression left;
   // private String operator;

    // protected BinaryOperation(Expression left, String operator, Expression right) {
    //     this.left = left;
    //     this.right = right;
    //   //  this.operator = operator;
    // }
    protected BinaryOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getRight() {
        return right;
    }

    public Expression getLeft() {
        return left;
    }

    @Override
    public String toString() {
        return "(" + this.getLeft().toString() + this.getOperator() + this.getRight().toString() + ")";
    }

    public abstract String getOperator();
}
