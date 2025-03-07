import java.util.Scanner;

public class Ex13 {
    public static void  main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Salário: R$");
        float salario = s.nextFloat();

        float aumento = (float)15/100;

        float novo_salario = salario + (salario * aumento);

        System.out.print("Seu salário com aumento de 15% é R$" + novo_salario);

    }
}
