package Animal;

public interface 동물 {
    public default String type() { 
        return this.getClass().getSimpleName();
      }

    public boolean 날수있니();// --> 초기화 블럭 
    public boolean 헤엄칠수있니();

}
