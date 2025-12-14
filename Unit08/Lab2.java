//multiply two matrixes 
public class Lab2 {

	public static void main(String[] args) {
	int[][] arr1 = new int[3][2];
	arr1[0][0] = 1;
	arr1[0][1] = 2;
	arr1[1][0] = 3;
	arr1[1][1] = 4;
	arr1[2][0] = 5;
	arr1[2][1] = 6;
	int[][] arr2 = new int[2][3];
	arr2[0][0] = 1;
	arr2[0][1] = 2;
	arr2[0][2] = 3;
	arr2[1][0] = 4;
	arr2[1][1] = 5;
	arr2[1][2] = 6;
	TwoDArray.print2dArr1(multiplication(arr1, arr2));
	}
	public static int[][] multiplication(int[][] a, int[][] b) {
		int[][] result = new int[a.length][b[0].length];
		for (int aRow = 0; aRow < a.length; aRow++) {
			for (int i = 0; i < a[aRow].length; i++) {
				for (int bCol = 0; bCol < b[0].length; bCol++) {
					result[aRow][bCol] += a[aRow][i] * b[i][bCol];
				}
			}
		}
		return result;
	}

}
