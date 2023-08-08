package Animal;

class Typing {
  public static void 날수있니(동물 x) {
    System.out.println(x.type() + (x.날수있니() ? "는(은) 날 수 있어." : "는(은) 못날아."));
  }
  
  public static void 헤엄칠수있니(동물 x) {
    System.out.println(x.type() + (x.헤엄칠수있니() ? "는(은) 헤엄칠 수 있어." : "는(은) 헤엄 못 쳐."));
  }


}
