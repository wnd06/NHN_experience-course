package usecases;

import regular.*;

public final class Literals implements regular.Visitor {
    
    
    private StringBuilder literalStringBuilder = new StringBuilder();
    
    @Override
    public void visit(Epsilon e) {
    }

    @Override
    public void visit(Literal e) {
        literalStringBuilder.append(e.getCharacter());
    }

    @Override
    public void visit(Then e) {
        e.getLeft().accept(this);

        e.getRight().accept(this);
    }

    @Override
    public void visit(Or e) {
        e.getLeft().accept(this);
        
        e.getRight().accept(this);
        
    }

    @Override
    public void visit(Star e) {
        e.getA().accept(this);
        
    }

    private final String getLiteralStringBuilder() {
        return this.literalStringBuilder.toString();
    }
    
    public static String of(regular.Expression e) {
        Literals literals = new Literals();
        e.accept(literals);
        return literals.getLiteralStringBuilder();
    }
    
}
