import java.util.Scanner;
import java.util.Calendar;

public class Ex22{
    public static void main(String[] argss) {
        
        Scanner a = new Scanner(System.in);
        System.out.print("Ano: ");
        int ano = a.nextInt();
        
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        
        int idade = year - ano;
        
        System.out.print("Com " + idade);
        
        if (idade >= 18) {
            System.out.println(" você deve se alistar.");
            
            int tempo_alistamento = (idade - 18);
            int ano_alistamento = year - tempo_alistamento;
            
            System.out.println("Você deveria ter se alistado ha " + tempo_alistamento + " anos.");
            System.out.println("No ano de " + ano_alistamento + ".");
            
        } else {
            System.out.println(" ainda não pode se alistar.");
            int tempo_alistamento = (18 - idade);
            int ano_alistamento = year + tempo_alistamento;
            
            System.out.println("Você deve se alistado daqui a " + tempo_alistamento + " anos.");
            System.out.println("No ano de " + ano_alistamento + ".");
            
        }
        
        
    }
}