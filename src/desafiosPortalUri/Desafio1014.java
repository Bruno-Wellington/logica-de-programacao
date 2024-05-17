package desafiosPortalUri;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1014 {

	public static void main(String[] args) {
		/* Calcule o consumo médio de um automóvel sendo fornecidos a distância total
		percorrida (em Km) e o total de combustível gasto (em litros).

		Entrada
		O arquivo de entrada contém dois valores: um valor inteiro X representando a
		distância total percorrida (em Km) e um valor real Y representando o total de
		combustível gasto, com um dígito após o ponto decimal.

		Saída
		Apresente o valor que representa o consumo médio do automóvel com 3 casas após
		a vírgula, seguido da mensagem "km/l". */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempoGasto = sc.nextInt();
		int velocidade = sc.nextInt();
		
		int consumo = 12;
		
		double litroGasto = (double) tempoGasto * velocidade / consumo;
		
		System.out.printf("%.3f%n", litroGasto);
		 
		sc.close();
	}
	
}
