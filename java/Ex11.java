import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){
        System.out.println("--- Calculadora de Delta ---");

        Scanner A = new Scanner(System.in);
        System.out.print("A = ");
        Double a = A.nextDouble();

        Scanner B = new Scanner(System.in);
        System.out.print("B = ");
        Double b = B.nextDouble();

        Scanner C = new Scanner(System.in);
        System.out.print("C = ");
        Double c = C.nextDouble();

        Double delta = (b * b) - (4 * a * c);

        System.out.println("Delta = b² - 4ac");
        System.out.println(delta + " = " + b + "² - 4 * " + a + " * " + c);

    }
}
