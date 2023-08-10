package regular;

public final class Literal implements Expression{
    private char character;

    public Literal(char c) {
        this.character = c;
    }

    public char getCharacter() {
        return character;
    }

    //toString은 엮으면 안됨! -> toString 과 literals의 목적이 서로 다르기 때문이다.
    
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
