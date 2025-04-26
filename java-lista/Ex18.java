import java.util.Scanner;
import java.util.Calendar;


public class Ex18 {
    public static void main(String[] argss){
        
        Scanner a = new Scanner(System.in);
        System.out.print("Ano de nascimento: ");
        int ano = a.nextInt();
        
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int idade = year - ano;
        
        System.out.println("Sua idade é " + idade);
        
        if (idade < 16) {
            System.out.println("Não pode votar.");
        }
        
        if (idade >= 16 && idade < 18) {
            System.out.println("Pode votar, mas não é obrigatório.");
        }
        
        if (idade >= 18) {
            System.out.println("Pode votar e voto obrigatório.");
        }
        
    }
}

