import java.util.Scanner;

public class Exmedia {
    public static void main(String[] args) {
        int numero;
        int soma = 0;
        int cont = 0;


        Scanner n = new Scanner(System.in);
        System.out.println("Entre com um número positivo, " +
                "um numero negativo encerra a digitação: ");

        while ((numero = n.nextInt()) >= 0) {
            soma += numero;
            cont++;
        }

        n.close();

        int media = soma/cont;

        System.out.println("\nA média dos numeros digitados é de: " + media +
                "\nForam digitados " + cont + " numeros.");

    }
}