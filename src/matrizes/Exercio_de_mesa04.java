package matrizes;

public class Exercio_de_mesa04 {

	public static void main(String[] args) {
		int n = 3;
		int x;
		int[] v = new int [n];
		int[][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			x = 0;
			for(int j=0; j<n;j++) {
				mat[i][j] = i + j;
				x = x + mat[i][j];
			}
			v[i] = x;
		}
		
		System.out.println("Matriz mat:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Vetor v");
		for(int i=0; i<n; i++) {
			System.out.print(v[i] + " ");
		}
		
	}
}
