import java.util.Scanner;

public class Ex06 {
    public static void main(String[] argss){

        Scanner n = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = n.nextInt();

        int suc = num + 1;
        int ant = num - 1;

        System.out.println("O antecessor de " + num + " é " +
                ant);

        System.out.println("O sucessor de " + num + " é " +
                suc);
    }
}
