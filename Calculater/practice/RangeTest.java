package Calculater.practice;

public class RangeTest {

    public static void classInveriant() {
        Range range = null;
        int lowerBound = -2;
        int upperBound = -6;
        
        try {
            range = new Range(lowerBound, upperBound);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void lowerBound() {
        assert true;
    }

    public void upperBound() {
        assert true;
    }

}
