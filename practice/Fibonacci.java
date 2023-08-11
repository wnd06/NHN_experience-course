package regular.practice;

public class Fibonacci {
    public static void main(String[] args) {

        int[] arr = new int[11];
        arr[1] = 1;
        arr[0] = 0;
        for (int i = 2; i < 11; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
