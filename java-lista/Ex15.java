import java.util.Scanner;

public class Ex15 {
    public static void  main(String[] args){

        Scanner d = new Scanner(System.in);
        System.out.print("Dias trabalhados: ");
        int dia = d.nextInt();

        int total_horas = dia * 8;
        float salario = total_horas * 25;

        System.out.println("Trabalhando " + dia + " dias o seu salário é: R$" + salario);
    }
}
