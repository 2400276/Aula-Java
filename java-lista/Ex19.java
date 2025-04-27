import java.util.Scanner;

public class Ex19{
    public static void main(String[] argss) {
        
        Scanner n = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = n.nextLine();
        
        Scanner n1 = new Scanner(System.in);
        System.out.print("Nota 1: ");
        Double nota1 = n1.nextDouble();
        
        Scanner n2 = new Scanner(System.in);
        System.out.print("Nota 2: ");
        Double nota2 = n2.nextDouble();
        
        Double media = (nota1 + nota2) / 2;
        
        System.out.print(nome + " sua media é " + media);
        
        if (media >= 7){
            System.out.println(". Bom aproveitamento.");
        } else {
            System.out.println(". Não obteve um bom aproveitamento.");

        }
        
        
        
    }
}