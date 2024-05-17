package desafiosPortalUri;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1016 {

	public static void main(String[] args) {
		/* Dois carros (X e Y) partem em uma mesma direção. O carro X sai com
		velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90
		Km/h. Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o
		carro Y tomar essa distância do outro carro.

		Entrada
		O arquivo de entrada contém um número inteiro.

		Saída
		Imprima o tempo necessário seguido da mensagem " minutos".
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		double Y = sc.nextDouble();
		
		double gasto = (double) X/Y;
		
		System.out.printf("%.3f km/l%n", gasto);
	
		sc.close();
	}
	
}
