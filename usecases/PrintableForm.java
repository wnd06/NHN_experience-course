package usecases;

import regular.*;

public final class PrintableForm implements regular.Visitor{

    private StringBuilder printableFormStringBuilder = new StringBuilder();

    @Override
    public void visit(Epsilon e) {
        printableFormStringBuilder.append("\u03B5");
    }

    @Override
    public void visit(Literal e) {
        printableFormStringBuilder.append(String.valueOf(e.getCharacter()));
        
    }

    @Override
    public void visit(Then e) {
        printableFormStringBuilder.append('(');
        e.getLeft().accept(this);
        printableFormStringBuilder.append("");
        e.getRight().accept(this);
        printableFormStringBuilder.append(')');
        
    }

    @Override
    public void visit(Or e) {
        printableFormStringBuilder.append('(');
        e.getLeft().accept(this);
        printableFormStringBuilder.append(e.getOperator());
        e.getRight().accept(this);
        printableFormStringBuilder.append(')');
        
    }

    @Override
    public void visit(Star e) {
        printableFormStringBuilder.append('(');
        e.getA().accept(this);
        printableFormStringBuilder.append(')');
        printableFormStringBuilder.append('*');
        
    }

    public static String of(regular.Expression e) {
        PrintableForm printableForm = new PrintableForm();
        e.accept(printableForm);
        return printableForm.getPrintableForm();
    }

    public String getPrintableForm() {
        return printableFormStringBuilder.toString();
    }

}
