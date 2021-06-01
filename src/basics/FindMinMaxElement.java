package basics;

public class FindMinMaxElement {

    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, -11, 330, 50000};
        getMinMax(arr);
    }

    private static void getMinMax(int[] arr) {

        int min = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}
