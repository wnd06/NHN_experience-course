package Final4;

public class Literals implements Visitor{
    private StringBuilder sb = new StringBuilder();
    @Override
    public void visit(Epsilon e) {
    }

    @Override
    public void visit(Literal e) {
        sb.append(e.getC());
    }

    @Override
    public void visit(Or e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
    }

    @Override
    public void visit(Then e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
    }

    @Override
    public void visit(Star e) {
        e.getE().accept(this);
    }

    public String getSb() {
        return this.sb.toString();
    }

    public static String of(Expression e) {
        Literals literals = new Literals();
        e.accept(literals);
        return literals.getSb();
    }


    
}
