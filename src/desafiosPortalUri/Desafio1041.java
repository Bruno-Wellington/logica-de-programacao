package desafiosPortalUri;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1041 {

	public static void main(String[] args) {
		/*Leia 2 valores com uma casa decimal (x e y), que devem representar as 
		 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante 
		 * ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na 
		 * origem (x = y = 0).
		 * 
		 * Se o ponto estiver na origem, escreva a mensagem “Origem”.
		 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme 
		 * for a situação.
		 * 
		 * Entrada
		 * A entrada contem as coordenadas de um ponto.
		 * 
		 * Saída
		 * A saída deve apresentar o quadrante em que o ponto se encontra.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		
		if(x == 0 && y == 0) {
			System.out.println("Origem");
			
		}else if(x == 0) {
			System.out.println("Eixo X");
			
		}else if(y == 0) {
			System.out.println("Eixo Y");
			
		}else if(x > 0 && y > 0) {
			System.out.println("Q1");
			
		}else if(x < 0 && y > 0) {
			System.out.println("Q2");
			
		}else if(x < 0 && y < 0) {
			System.out.println("Q3");
			
		}else if(x > 0 && y < 0) {
			System.out.println("Q4");
			
		}

		
		sc.close();
	}
	
}
