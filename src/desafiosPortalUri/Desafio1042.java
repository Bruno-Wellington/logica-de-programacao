package desafiosPortalUri;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1042 {

	public static void main(String[] args) {
		/*Leia 3 valores inteiros e ordene-os em ordem crescente. No final, 
		 * mostre os valores em ordem crescente, uma linha em branco e em 
		 * seguida, os valores na sequência como foram lidos.
		 * 
		 * Entrada
		 * A entrada contem três números inteiros.
		 * 
		 * Saída
		 * Imprima a saída conforme foi especificado.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a < b && a < c) {
			System.out.println(a);
			if(b < c) {
				System.out.println(b);
				System.out.println(c);
			}else {
				System.out.println(c);
				System.out.println(b);
			}
			
		}else if(b < a && b < c) {
			System.out.println(b);
			if(a < c) {
				System.out.println(a);
				System.out.println(c);
			}else {
				System.out.println(c);
				System.out.println(a);
			}
			
		}else if(c < a && c < b) {
			System.out.println(c);
			if(a < b) {
				System.out.println(a);
				System.out.println(b);
			}else {
				System.out.println(b);
				System.out.println(a);
			}
		}
		
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();
	}	
}
