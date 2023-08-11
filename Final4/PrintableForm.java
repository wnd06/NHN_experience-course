package Final4;

public class PrintableForm implements Visitor {
    private StringBuilder sb = new StringBuilder();
    @Override
    public void visit(Epsilon e) {
        sb.append("ε");
    }

    @Override
    public void visit(Literal e) {
        sb.append(e.getC());
    }

    @Override
    public void visit(Or e) {
        sb.append("(");
        e.getLeft().accept(this);
        sb.append(e.getOperator());
        e.getRight().accept(this);
        sb.append(")");
    }

    @Override
    public void visit(Then e) {
        sb.append("(");
        e.getLeft().accept(this);
        sb.append(e.getOperator());
        e.getRight().accept(this);
        sb.append(")");
    }

    @Override
    public void visit(Star e) {
        sb.append("(");
        e.getE().accept(this);
        sb.append(")");
        sb.append(e.getOperator());
    
    }

    public String getSb() {
        return this.sb.toString();
    }


    public static String of(Expression e) {
        PrintableForm printableForm = new PrintableForm();
        e.accept(printableForm);
        return printableForm.getSb();
    }

    

    
}
