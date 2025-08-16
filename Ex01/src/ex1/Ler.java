package ex1;
import java.util.Scanner;

public class Ler {

	public static void main(String[] args) {
		
	    // instanciando um objeto scanner no sc
		Scanner sc = new Scanner(System.in);
		//tipo classe    tipo construtor
		//Scanner esta apontando para sc
		//System.in = conexão com a entrada, teclado
		
		System.out.print("Digite seu nome: ");
		String nome;
		nome = sc.nextLine();
		
		System.out.println("Seu nome é " + nome);

	}

}
