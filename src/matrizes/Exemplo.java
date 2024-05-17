package matrizes;

public class Exemplo {

	public static void main(String[] args) {
		int x = 0;
		int m = 2;
		int n = 3;
		int[] v = new int [4];
		int[][] mat = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n;j++) {
				x = x + 2;
				mat[i][j] = x;
			}
			v[i] = x;
		}
		
		System.out.println("Matriz mat:");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Vetor v");
		for(int i=0; i<m; i++) {
			System.out.print(v[i] + " ");
		}
		
	}

}
