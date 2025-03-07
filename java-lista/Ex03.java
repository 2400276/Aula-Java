import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        System.out.print("Nome do Funcionario: ");
        String funcionario = nome.nextLine();

        Scanner num = new Scanner(System.in);
        System.out.print("Salario: ");
        Double salario = num.nextDouble();

        System.out.println("O funcionário " + funcionario + " tem um " +
                "salário de R$" + salario + " em junho.");

    }
}
