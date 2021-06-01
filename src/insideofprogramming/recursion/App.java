package insideofprogramming.recursion;

public class App {

    public static void main(String[] args) {
        System.out.println(calculateFactorial(4));
    }

    private static int calculateFactorial(int number) {
        if (number == 1)
            return 1;
        return calculateFactorial(number - 1) * number;
    }
}
