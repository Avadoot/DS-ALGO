package insideofprogramming.arrays.reversearray;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 7};
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {

        int startIndex = 0;
        int endIndex = 4;
        int temp;
        while (startIndex < endIndex) {
            temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
