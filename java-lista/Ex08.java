import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){

        Scanner n = new Scanner(System.in);
        System.out.println("Digite uma distância em metros: ");
        int num = n.nextInt();

        int cm = num * 100;

        System.out.println("Distância de: " + cm + "Cm");

    }
}
