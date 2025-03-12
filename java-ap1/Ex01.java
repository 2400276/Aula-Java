import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){

        Scanner f = new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        double fahrenheit = f.nextDouble();

        double celsius = (32 - fahrenheit) * ((double) 5 /9);

        System.out.print("Celsius: " + celsius);
    }
}
