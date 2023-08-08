package regular;

public class Epsilon implements Expression {
    // public static final Epsilon value = new Epsilon();
    public static final Epsilon value = new Epsilon();

    private Epsilon() {}

    @Override
    public String toString() {
        return "\u03B5";
    }

    

    // public static synchronized Epsilon getInstance() {
    //     if(instance == null) {
    //     instance = new Epsilon()
    //     }
    //     return instance;
    // }
}
