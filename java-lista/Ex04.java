import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner num_1 = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num1 = num_1.nextInt();

        Scanner num_2 = new Scanner(System.in);
        System.out.print("Digite outro numero: ");
        num2 = num_2.nextInt();

        num_2.close();

        int soma = num1 + num2;

        System.out.println("A soma entre " + num1 + " e " + num2 + " é " + soma);
    }
}
