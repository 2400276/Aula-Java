import java.util.Scanner;

public class Ex20{
    public static void main(String[] argss) {
        
        Scanner num = new Scanner(System.in);
        System.out.print("Numero: ");
        int numero = num.nextInt();
        
        int div = numero % 2;
        
        System.out.print("O numero " + numero);
        
        if (div == 0)    {
            System.out.println(" é par.");
        } else {
            System.out.println(" é impar.");
        }
        
    }
}