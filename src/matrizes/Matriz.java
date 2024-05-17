package matrizes;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		/* Uma matriz corresponde a uma coleção de dados de tamanho
		 * fixo, indexada, bidimensional e homogenia.
		 * 
		 * Indexada: os elementos são acessados por meio de indices
		 * Bidimensional: duas dimensões
		 * Homogenea: todos dados são do mesmo tipo
		 */

		/* faça um programa para ler dois numeros inteiros positivos
		 * M e N, depois ler uma matriz de M linhas e N colunas contendo
		 * numeros inteiros. Em seguida, mostrar na tela a matriz lida.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] a = new int [m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
