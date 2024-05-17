package desafiosPortalUri;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1045 {

	public static void main(String[] args) {
		/*Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem 
		 * decrescente, de modo que o lado A representa o maior dos 3 
		 * lados. A seguir, determine o tipo de triângulo que estes três 
		 * lados formam, com base nos seguintes casos, sempre escrevendo 
		 * uma mensagem adequada:
		 * 
		 * -se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
		 * -se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULOse A2 > B2 + C2, 
		 *  apresente a mensagem: TRIANGULO OBTUSANGULO
		 * -se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
		 * -se os três lados forem iguais, apresente a mensagem: TRIANGULO E
		 *  QUILATERO
		 * -se apenas dois dos lados forem iguais, apresente a mensagem: 
		 *  TRIANGULO ISOSCELES
		 *  
		 *  Entrada
		 *  A entrada contem três valores de ponto flutuante de dupla 
		 *  precisão A (0 < A) , B (0 < B) e C (0 < C).
		 *  
		 *  Saída
		 *  Imprima todas as classificações do triângulo especificado na 
		 *  entrada.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double A = 0;
		double b = sc.nextDouble();
		double B = 0;
		double c = sc.nextDouble();
		double C = 0;
		String tipo = "";
		
		//Invertendo valores
		if(a < b) {
			A = b;
			B = a;
			C = c;
			if(a < c ) {
				A = c;
				B = b;
				C = a;		
			}
			
		}else if(a < c) {
			A = c;
			B = b;
			C = a;
				
		}else {
			A = a;
			B = b;
			C = c;
		}
		
		//Verificação to tipo
		if(A == B && A == C && B == C) {
			tipo = "TRIANGULO EQUILATERO";
			
		}else if(A == B || A == C || B == C) {
			tipo = "TRIANGULO ISOSCELES";
			
		}
		
		//Definição
		if(A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
			
		}else if((A * A) == (B * B) + (C * C)) {
			System.out.println("TRIANGULO RETANGULO");
			
		}else if((A * A) > (B * B) + (C * C)) {
			System.out.println("TRIANGULO OBTUSANGULO");
			System.out.println(tipo);
			
		}else if((A * A) < (B * B) + (C * C)) {
			System.out.println("TRIANGULO ACUTANGULO");
			System.out.println(tipo);
		}

		sc.close();
	}
	
}
