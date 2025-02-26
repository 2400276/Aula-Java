import java.util.Scanner;

public class Ex07 {
    public static void main(String[] argss){

        Scanner n = new Scanner(System.in);
        System.out.print("Digite um número: ");
        Double num = n.nextDouble();

        Double dobro = num * 2;
        Double terco = num / 3;

        System.out.println("O dobro de " + num + " é " + dobro);
        System.out.println("A terça parte de " + num + " é " + String.format("%.4f", terco));
    }
}
