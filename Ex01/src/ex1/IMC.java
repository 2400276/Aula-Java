package ex1;

public class IMC {

	public static void main(String[] args) {
		
		double peso;
		peso = 77.5;
		
		double altura;
		altura = 1.75;
		
		double imc;
		
		imc = peso / (altura * altura);
		
		System.out.println("IMC = " + imc);

	}

}
