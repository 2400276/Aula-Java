package ex02;
import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu imc? ");
		float imc;
		imc = sc.nextFloat();
		
		if (24.9 < imc && imc > 18.5){
			System.out.println("IMC saudavel.");

		} else {
			System.out.println("IMC não saudavel.");

		}

	}

}
