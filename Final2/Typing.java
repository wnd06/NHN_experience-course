package Final2;

public class Typing {

    public static String type(Object thing) {
        return thing.getClass().getSimpleName();
    }

    public static void 날수있니(동물 x) {
        System.out.println(Typing.type(x) + (x.날수있니() ? "는(은) 날 수 있어." : "는(은) 못날아."));
    }

    public static void main(String[] args) {
        
        Flyable[] 날것들 = {new 박쥐(), new 참새()};

        for (Flyable 날것 : 날것들) {
            Typing.날수있니(날것);
        }
    }

    private static void 날수있니(Flyable x) {
        System.out.println(Typing.type(x) + ("는(은) 날 수 있어."));
    }


}
