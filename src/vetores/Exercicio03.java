package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*Imprimir apenas os numeros negativos informados*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		double soma = 0;
		double altMedia = 0;
		
		for(int i =0; i < n; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			alturas[i] = sc.nextDouble();
			
		}
		
		for(int i =0; i < n; i++) {
			soma = soma + alturas[i];
		}
		
		altMedia = soma / n;
		System.out.printf("%.2f%n", altMedia);
		
		
		int cont = 0;
		for(int i =0; i < n; i++) {
			if(idades[i] < 16) {
				cont = cont + 1;
			}
		}
		
		double x = cont * 100.0 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", x);
		
		
		sc.close();
	}

}
