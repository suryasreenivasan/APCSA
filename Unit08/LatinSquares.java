import java.util.*;
/* 1 2 3 4 
 * 2 3 4 1
 * 3 4 1 2
 * 4 1 2 3
 */
public class LatinSquares {

	public static void main(String[] args) {
		System.out.println("what is the size for square matrix? ");
		Scanner scanner = new Scanner(System.in);
		TwoDArray.print2dArr1(latinSquare(scanner.nextInt()));
		scanner.close();
			
		}
	

	
	public static int[][] latinSquare(int size) {
		int[][] result = new int[size][size];
		
		for (int i = 0; i < result.length; i++) {
			int row = i + 1;
			for (int j = 0; j <result[i].length; j++) {
				if (row > size) row = 1;
				result[i][j] = row++;
			}
		}
		return result;
	}
}
