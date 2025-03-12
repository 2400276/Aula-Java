import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){

        Scanner p = new Scanner(System.in);
        System.out.print("Peso: ");
        double peso = p.nextDouble();

        Scanner a = new Scanner(System.in);
        System.out.print("Altura em metros: ");
        double altura = a.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);
    }
}
