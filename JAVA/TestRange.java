package JAVA;

public class TestRange {

    public static void classInveriant() {
        Range range = null;
        int x = -1;
        int y = 7;
        try {
            range = new Range(x, y);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
    }

}
