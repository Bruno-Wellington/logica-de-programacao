package matrizes;

public class Exercio_de_mesa05 {

	public static void main(String[] args) {
		int m = 5;
		int[] v = new int[m];
		int[][] mat = new int[m][m];
		
		for(int i=0; i<m; i++) {
			v[i] = 10 - i;
		}

		for(int i=0; i<m; i++) {
			mat[i][i] = v[i] / 10;
		}
		
		for(int i=0; i<m; i++) {		
			System.out.print(v[i] + " ");
			
		}
		System.out.println();
		
		for(int i=0; i<m; i++) {		
			System.out.print(mat[i][i] + " ");
			
		}
		System.out.println();
		
	}

}
