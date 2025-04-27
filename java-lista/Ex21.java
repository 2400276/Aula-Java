import java.util.Scanner;

public class Ex21{
    public static void main(String[] argss) {
        
        Scanner a = new Scanner(System.in);
        System.out.print("Ano: ");
        int ano = a.nextInt();
        
        int div = ano % 4;
        int div2 = ano % 400;
        int div3 = ano % 100;
        
        
        System.out.print("O ano " + ano);
        
        if (div == 0 && div2 != 0 && div3 != 0) { 
            System.out.println(" é bissexto.");
            
        } else {
            System.out.println(" não é bissexto.");
        }
        
        
    }
}