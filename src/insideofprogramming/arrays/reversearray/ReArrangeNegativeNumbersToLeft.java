package insideofprogramming.arrays.reversearray;

public class ReArrangeNegativeNumbersToLeft {
    public static void main(String[] args) {
        int[] arr = {-1, 34, 23, 64, 13, 45, -34, -54, -23, 23, -32};
        rearrangeArray(arr);
    }

    private static void rearrangeArray(int[] arr) {

        int temp, j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                System.out.println(arr[j]);
            }
        }
    }
}
