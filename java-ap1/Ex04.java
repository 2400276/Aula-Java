import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args){

        Scanner v = new Scanner(System.in);
        System.out.print("Valor: ");
        int valor = v.nextInt();

        int quadrado = valor * valor;
        int cubo = valor * valor * valor;

        System.out.println("Quadrado: " + quadrado);
        System.out.println("Cubo: " + cubo);

    }
}
