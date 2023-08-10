package regular;
// T타입으로 줘서 한다.
public interface Visitor<T> {

    public void visit(Epsilon e);

    public void visit(Literal e);

    public void visit(Then e);
    
    public void visit(Or e);

    public void visit(Star e);
}
