package subtyping;

/*
 * 형용사 스러운?
 */
interface Flyable {

}

interface Swimable {

}

final class 비행기 implements Flyable{

}

final class FlyableBat extends 박쥐 implements Flyable{

}

final class 헤엄치고날으는펭귄 extends 펭귄 implements Swimable, Flyable{

}
// Legacy code
abstract class 동물 { //abstract - 밑의 내용을 간추린 것이다..

    private boolean flyable;

    protected 동물(boolean flyable){
        this.flyable = flyable;
     }

    public String type() {
        return Typing.type(this);
    }

    public boolean 날수있니() {
        return flyable;
    }
}


abstract class 새 extends 동물 {
    public 새(boolean flyable) {
        super(true);
    }
}


class 박쥐 extends 동물 {
    박쥐() {
        super(true);
    }
}


class 참새 extends 새 {
    참새() {
        super(true);
    }
}


class 펭귄 extends 새 {
    펭귄() {
        super(false);
    }

}


public class Typing {
    public static String type(Object thing) {
        return thing.getClass().getSimpleName();
    }
    public static void 날수있니(동물 x) {
        // Dynamic dispatch on type
        // RTTI (RunTime Type Identification)
        // if (a instanceof 박쥐)
        // System.out.println(("박쥐는 날 수 있어."));
        // else if (a instanceof 참새)
        // System.out.println(("참새는 날 수 있어."));
        // else if (a instanceof 펭귄)
        // System.out.println(("펭귄는 날 수 없어."));
        System.out.println(Typing.type(x) + (x.날수있니() ? "는(은) 날 수 있어." : "는(은) 못 날아."));
    }
    

    public static void 날수있니(Flyable thing) {
        System.out.println(Typing.type(thing) + ("는(은) 날 수 있어."));
    }

    public static void main(String[] args) {
        Flyable[] 날것들 = {new FlyableBat(), new 비행기()};

        //Swimable no = new 참새(); //--> 참새는 Swimable을 implements를 하지 않았기 때문에
        Swimable s = new 헤엄치고날으는펭귄();
        for (Flyable 날것 : 날것들)
            Typing.날수있니(날것); // dynamic method binding on actual type - dynamic dispatch - 메서드를 재정의
    }


}

