package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida,
		 * mostrar o valor da área, perímetro e diagonal deste retângulo, com quatro casas
		 * decimais, conforme exemplo. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = (base * 2.0) + (altura * 2.0); // ou 2.0 * (base + altura);
		double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		
		System.out.printf("Area = %.4f%n",area);
		System.out.printf("Perimetro = %.4f%n",perimetro);
		System.out.printf("Diagonal = %.4f%n",diagonal);
		
		sc.close();
	}

}
