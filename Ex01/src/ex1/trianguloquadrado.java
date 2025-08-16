package ex02;
import java.util.Scanner;

public class trianguloquadrado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lado A do triangulo: ");
		int a;
		a = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Lado B do triangulo: ");
		int b;
		b = sc2.nextInt();
		
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Lado C do triangulo: ");
		int c;
		c = sc3.nextInt();
		
		float area;
		area = (b * a) / 2;
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Lado A do retangulo: ");
		int ar;
		ar = sc.nextInt();
		
		Scanner sc5 = new Scanner(System.in);
		System.out.println("Lado B do retangulo: ");
		int br;
		br = sc2.nextInt();
		
		
		Scanner sc6 = new Scanner(System.in);
		System.out.println("Lado C do retangulo: ");
		int cr;
		cr = sc3.nextInt();
		
		float arear;
		arear = br * ar;
		
		if (area > arear) {
			System.out.println("Area do triangulo é maior que a area do retangulo");
		} else {
			System.out.println("Area do retangulo é maior que a area do triangulo");

		}
		
		
		
	}

}
