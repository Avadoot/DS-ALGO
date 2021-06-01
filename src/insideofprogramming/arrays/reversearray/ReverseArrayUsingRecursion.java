package insideofprogramming.arrays.reversearray;

import java.util.Arrays;

public class ReverseArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 7};
        reverseArray(arr, 0, arr.length - 1);
    }

    private static void reverseArray(int[] arr, int startIndex, int endIndex) {

        int temp;
        if (startIndex >= endIndex)
            return;
        temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;
        reverseArray(arr, startIndex + 1, endIndex - 1);

        System.out.println(Arrays.toString(arr));
    }
}
