package Calculater.practice;

// Abstraction barrier
public final class Range {
    int upperBound;
    int lowerBound;

    public Range(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        classInveriant();
    }
    public Range(int upperBound) {
        this(0, upperBound);
    }

    private void classInveriant() {
        if (this.lowerBound > this.upperBound)
            throw new IllegalArgumentException("Range: " + lowerBound + " > " + upperBound);
    }

    public int getUpperBound() { // selector/accesor - getter
        return this.upperBound;
    }

    public int getLowerBound() {
        return this.lowerBound;
    }
    // modifiers/mutator - setters
    //Range는 처음 주어진 범위의 값을 변경하면 안되기 때문에 setter는 사용하면 안된다.
    // 그러므로 setter는 만들 필요가 없다
}
