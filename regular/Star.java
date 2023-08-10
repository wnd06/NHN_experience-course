package regular;

//Star는 BinaryOperation의 Subtyping이 아니라서 extends 사용 불가?? -> 타입은 동일하나 조건이 다르기 때문에?

public final class Star implements Expression{

    private Expression a;
    
    public Star(Expression a) {
        this.a = a;
    }
    
    public Expression getA() {
        return a;
    } 

    @Override   
    
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
