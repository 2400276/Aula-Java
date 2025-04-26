
import java.util.Scanner;

public class Ex17
{
	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		System.out.print("Velocidade do carro: ");
		Double velocidade = v.nextDouble();
		
		if (velocidade > 80) {
		    System.out.println("Você foi multado.");
		    System.out.println("Velocidade maior que 80km/h.");
		    
		    Double multa = (velocidade - 80) * 5;
		    
		    System.out.println("Multa de R$ " + multa);
		}
	}
}