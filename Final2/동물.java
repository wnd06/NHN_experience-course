package Final2;

abstract class 동물 {

    private boolean flyable;

    public 동물(boolean flyable) {
        this.flyable = flyable;
    }
    public String type() {
        return Typing.type(this);
    }

    public boolean 날수있니() {
        return flyable;
    }
        
}
