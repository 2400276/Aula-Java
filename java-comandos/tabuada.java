import java.util.Scanner;

public class tabuada {
    public static void main(String[] args){

        Scanner n = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = n.nextInt();

        System.out.println("=== Tabuada do " + num + " ===");

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + i * num);
        }

    }
}
