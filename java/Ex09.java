import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args){
        System.out.println("=== Conversor de moeda ===");
        Scanner d = new Scanner(System.in);
        System.out.print("R$: ");
        Double reais = d.nextDouble();

        Double dolar = reais / 3.45;

        System.out.println("USD: " + String.format("%.2f", dolar));

    }
}
