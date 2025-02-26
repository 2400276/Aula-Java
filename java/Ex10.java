import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        System.out.print("Altura: ");
        Double altura = a.nextDouble();

        Scanner l = new Scanner(System.in);
        System.out.print("Largura: ");
        Double largura = l.nextDouble();

        Double area = altura * largura;
        Double tinta = area / 2;

        System.out.println("Area a ser pintada: " + area + "m²");
        System.out.println("Tinta a ser usada: " + tinta + "l");
    }
}
