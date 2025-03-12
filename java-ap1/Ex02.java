import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        System.out.print("Celsius: ");
        double celsius = c.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.print("Fahrenheit: " + fahrenheit);

    }
}
