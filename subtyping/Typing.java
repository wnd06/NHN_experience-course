package subtyping;

abstract class 동물 {

    public final String type() {
        return this.getClass().getSimpleName();
    }

    public void 날수있니() {
        System.out.println((this.type() + "은(는) 날 수 없어"));

    }
}


class 새 extends 동물 {
    public void 날수있니() {
        System.out.println((this.type() + "은(는) 날 수 있어"));
    }
}


class 박쥐 extends 새 {

}


class 참새 extends 새 {

}


class 펭귄 extends 새 {

}


public class Typing {
    public static void 날수있니(동물 x) {
        // Dynamic dispatch on type
        // RTTI (RunTime Type Identification)
        // if (a instanceof 박쥐)
        // System.out.println(("박쥐는 날 수 있어."));
        // else if (a instanceof 참새)
        // System.out.println(("참새는 날 수 있어."));
        // else if (a instanceof 펭귄)
        // System.out.println(("펭귄는 날 수 없어."));
        System.out.println( x.type() + (x.날수있니()? "는(은) 날 수 있어.": "는(은) 못날아.") );
        


    }

    // public static void 헤엄칠수있니(동물 x) {
    // System.out.println(x.type() + (x.헤엄칠수있니() ? "는(은) 헤엄칠 수 있어." : "는(은) 헤엄 못 쳐."));
    // }

    public static void main(String[] args) {
        동물[] 동물들 = {new 박쥐(), new 참새(), new 펭귄()};
        for (동물 한마리 : 동물들)
            한마리.날수있니(); // dynamic method binding on actual type - dynamic dispatch - 메서드를 재정의
    }


}

