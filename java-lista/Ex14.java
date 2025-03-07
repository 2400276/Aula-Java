import java.util.Scanner;

public class Ex14 {

    public static void  main(String[] args){

        Scanner k = new Scanner(System.in);
        System.out.print("KM rodados: ");
        float km = k.nextFloat();

        Scanner d = new Scanner(System.in);
        System.out.print("Dias rodados: ");
        int dia = d.nextInt();

        float dia_valor = dia * 90;
        float km_valor = (float) (km * 0.2);

        float preco_total = dia_valor + km_valor;

        System.out.println("O valor total desse aluguel é de R$" + preco_total);

    }
}
