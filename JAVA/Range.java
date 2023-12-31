package JAVA;

public class Range {

    private int x;
    private int y;

    public Range(int x, int y) {
        this.x = x;
        this.y = y;
        classInveriant();
    }

    private void classInveriant() {
        if (this.x < 0 || this.y < 0)
            throw new IllegalArgumentException("값이 너무 작습니다.");
        return;
    }

    public Range(int x) {
        this(x, 0);
    }

    public int getX() {
        return this.x = x;
    }

    public int getY() {
        return this.y = y;
    }

    public static int add(Range range) { //add공식은 따로 있어야함 이 구간은 그저 getter에서 가져온 값을 연산코드에 넣어주는 역할
        return Mathx.add(range.getX(), range.getY());
    }
    
}
