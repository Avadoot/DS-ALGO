package insideofprogramming.arrays;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        // Arrays are a type of reference type i.e. they point to different
        // addresses in memory which hold certain values (integer or String etc)

        // declaration
        int[] intArray;

        // assignment
        intArray = new int[5];

        // below will print memory address of array
        System.out.println(Arrays.toString(intArray));
        System.out.println(intArray[0]); // default init with value 0 is done.

        // Lets assign some values
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;

        // Lets use a loop to print the values:
        for (int idx = 0; idx < intArray.length; idx++) {
            System.out.print(" " + intArray[idx]);
        }

        // another way of doing declaration + assignment at the same time in java
        int[] numbers = {4, 8, 12};

        // now lets iterate again and print it.
        for (int i = 0; i < numbers.length; i++) {
            // remember length gives size of array which is 3 in this case
            // we need to ensure we have index as always size - 1
            System.out.println(numbers[i]);
        }
    }
}

