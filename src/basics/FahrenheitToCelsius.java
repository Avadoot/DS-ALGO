package basics;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static double convert(double temperature) {
        return (temperature - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit: ");
        double fahrenheit = in.nextDouble();
        in.close();

        double converted  = convert(fahrenheit);
        System.out.println("Temperature in celsius " + converted);
    }
}
