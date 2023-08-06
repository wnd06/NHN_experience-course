package JAVA;

public class AddTest {
    public static void classInveriant() {
        try {
            Mathx.add(-1, 2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.exit(1);
    }
    public static void recursionCase() {
        if (Mathx.add(1, 1) != 2)
            System.exit(1);
        return;
    }

    public static void preCondition() {
        try {
            Mathx.add(-1, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("0이하의 수는 넣을 수 없습니다.");
            return;
        }
        System.exit(1);
    }

    public static void postCondition() {
        try {
            Mathx.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
        } catch (ArithmeticException e) {
            System.out.println("error");
            return;
        }
        System.exit(1);
    }
}
