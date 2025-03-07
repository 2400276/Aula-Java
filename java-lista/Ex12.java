import java.util.Scanner;

public class Ex12 {
    public static void  main(String[] args){

        Scanner p = new Scanner(System.in);
        System.out.print("Digite o preço: R$");
        float preco = p.nextFloat();

        float desconto = (float) 5 /100;


        float preco_promocional = preco - (preco * desconto);

        System.out.println("Seu preço com 5% de desconto: R$" + preco_promocional);


    }
}
