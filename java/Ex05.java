import java.util.Scanner;

public class Ex05 {
    public static void main(String[] argss){

        Scanner nota = new Scanner(System.in);
        System.out.print("Nota 1: ");
        Double nota1 = nota.nextDouble();

        Scanner notadois = new Scanner(System.in);
        System.out.print("Nota 2: ");
        Double nota2 = notadois.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("A sua média é: " + media);
    }
}
