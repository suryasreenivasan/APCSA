
public class Lab3 {
	public static void main(String[] args) {
		int size = 4;
		int[][] mat = new int[size][size];
		for (int r = 0; r < size; r++) {
			for (int c = 0; c < size; c++) {
				if (Math.random() >= 0.5) mat[r][c] = 1;
				else mat[r][c] = 0;
			}
		}
		TwoDArray.print2dArr1(mat);
		int maxRow = 0;
		int max = 0;
		for (int i = 0; i < mat.length; i++) {
			int sum = 0;
			for (int j = 0; j < mat[i].length; j++) {
				sum += mat[i][j];
			}
			if (sum > max) {
				max = sum;
				maxRow = i;
			}
		}
		System.out.println("the first row with most 1's: " + (maxRow + 1));
		
		int maxCol = 0;
		max = 0;
		for (int i = 0; i < mat.length; i++) {
			int sum = 0;
			for (int j = 0; j < mat.length; j++) {
				sum += mat[j][i];
			}
			if (sum > max) {
				max = sum;
				maxCol = i;
			}
		}
		System.out.println("the first column with most 1's: " + (maxCol + 1));
	}
}
