
public interface Visitor {
    default void visit(Top top) { throw new NoSuchMethodError(); }
    void visit(Left left);
    void visit(Right right);
}
