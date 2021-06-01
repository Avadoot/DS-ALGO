package insideofprogramming.castingnumericalvalues;

public class App {

    public static void main(String[] args) {

        byte aByte = 126;
        int aInt = 999;
        long aLong = 65232;

        float aFloat = 1235.35f;
        double aDouble = 12345.23;

        int bInt = (int) aLong; // down casting: Should be really sure.
        System.out.println(bInt);

        float bFloat = aInt;
        System.out.println(bFloat); // up casting: usually okay.

        int cInt = (int) aFloat;
        System.out.println(cInt); // down castingL would remove any value after decimal.

        // Following pushes the value to + difference starting from minimum value.
        // Don't try this as it leads to unexpected results.
        // 128 is a bigger value than max of byte. (-127 to +127)
        byte bByte = (byte)128;
        System.out.println(bByte);
    }
}
