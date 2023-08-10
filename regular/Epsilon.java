package regular;

public class Epsilon implements Expression {
    // public static final Epsilon value = new Epsilon();
    public static final Epsilon value = new Epsilon();

    private Epsilon() {}

    
   

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    

    // public static synchronized Epsilon getInstance() {
    //     if(instance == null) {
    //     instance = new Epsilon()
    //     }
    //     return instance;
    // }
}
