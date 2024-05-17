package desafiosPortalUri;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1043 {

	public static void main(String[] args) {
		/*Leia 3 valores reais (A, B e C) e verifique se eles formam ou não 
		 * um triângulo. Em caso positivo, calcule o perímetro do triângulo 
		 * e apresente a mensagem:
		 * 
		 * Perimetro = XX.X
		 * 
		 * Em caso negativo, calcule a área do trapézio que tem A e B como 
		 * base e C como altura, mostrando a mensagem
		 * 
		 * Area = XX.X
		 * 
		 * Entrada
		 * A entrada contém três valores reais.
		 * 
		 * Saída
		 * O resultado deve ser apresentado com uma casa decimal.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double perimetro = 0;
		double area = 0;
		
		if(a+b > c && a+c > b && b+a > c && b+c > a
				&& c+a > b && c+b > a) {
			
			perimetro = a+b+c;
			System.out.printf("Perimetro = %.1f%n", perimetro);
			
		}else {
			area = (a+b) * c / 2;
			System.out.printf("Area = %.1f%n", area);
		}
		
		
		sc.close();
	}
	
}
