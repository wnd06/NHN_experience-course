package regular;

class BinaryOperation{ // --> default scope 외부에서 사용 불가능
    private Expression right;
    private Expression left;
    private String operator;

    // protected BinaryOperation(Expression left, String operator, Expression right) {
    //     this.left = left;
    //     this.right = right;
    //   //  this.operator = operator;
    // }
    protected BinaryOperation(Expression left, String string, Expression right) {
        this.left = left;
        this.right = right;
        this.operator = operator; // -> "|" ,  "" 
    }

    public Expression getRight() {
        return right;
    }

    public Expression getLeft() {
        return left;
    }

   

    String getOperator() {
        return this.operator;
    }

    //public abstract String getOperator();

    // BinaryOperation e = new Or(a, b);
}
