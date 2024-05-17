package matrizes;

public class Exercio_de_mesa03 {

	public static void main(String[] args) {
		int m = 5;
		int[][] mat = new int[m][m];
		
		for(int i=0; i<m; i++) {
			mat[3][i] = 10;
		}

		for(int i=0; i<m; i++) {
			mat[i][4] = 10 * i;
			mat[i][i] = 50;
		}
		
		for(int i=0; i<m; i++) {		
			System.out.print(mat[i][i] + " ");
			
		}
		System.out.println();
		
	}

}
