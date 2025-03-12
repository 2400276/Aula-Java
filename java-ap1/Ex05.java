import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);
        System.out.print("Base: ");
        int base = b.nextInt();

        Scanner a = new Scanner(System.in);
        System.out.print("Altura: ");
        int altura = a.nextInt();

        double area = (double) (base * altura) / 2;

        System.out.println("Area: " + area);
    }
}
