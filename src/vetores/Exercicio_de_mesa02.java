package vetores;

import java.util.Scanner;

public class Exercicio_de_mesa02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contador = 3;
		int[] v = new int[7];
		int[] w = new int[7];
		int a = 2;
		
		for(int c=0; c < contador; c++) {
			v[c] = a;
			w[c] = c * v[c];

		}
		
		for(int c=0; c < contador; c++) {
			System.out.println("v["+ v[c] + "] - w[" + w[c] + "]");
		}
		
		sc.close();
	}

}
