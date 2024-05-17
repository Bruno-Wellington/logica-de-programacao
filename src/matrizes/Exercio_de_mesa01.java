package matrizes;

public class Exercio_de_mesa01 {

	public static void main(String[] args) {
		
		int n = 3;
		int[][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = 1 + i + j;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
