import java.util.Scanner;

public class Ex16 {
    public static void  main(String[] args){

        Scanner d = new Scanner(System.in);
        System.out.print("Cigarros fumados no dia: ");
        int dia = d.nextInt();

        Scanner a = new Scanner(System.in);
        System.out.print("Anos como fumante: ");
        int ano = a.nextInt();

        int total_cigarros = dia * 365 * ano;

        int min_fumados = total_cigarros * 10;
        int horas_fumadas = min_fumados / 60;
        int dia_fumados = horas_fumadas / 24;

        System.out.println("Apos fumar " + total_cigarros + " cigarros.");
        System.out.println("Foi perdido " + dia_fumados + " dias de vida.");


    }
}
