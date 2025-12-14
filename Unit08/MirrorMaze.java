/*
 * 1 2 3  
 * 4 5 6
 * 7 8 9
 * 10 11 12
 * 
 * 10 11 12
 * 7 8 9
 * 7 8 9
 * 10 11 12
 * 
 * 13 14 15
 * 16 17 18
 * 19 20 21
 * 22 23 24
 * 25 26 27
 * 
 * 25 26 27
 * 22 23 24
 * 19 20 21
 * 22 23 24
 * 25 26 27
 */
public class MirrorMaze {
	
	public static void main(String[] args) {
		int num = 1;
		int[][] test = new int[1][10];
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				test[i][j] = num++;
			}
		}
		System.out.println("Before:");
		TwoDArray.print2dArr1(test);
		System.out.println("After:");
		mirrors(test);
		int[][] test2 = new int[2][15];
		num = 13;
		for(int i = 0; i < test2.length; i++) {
			for(int j = 0; j < test2[i].length; j++) {
				test2[i][j] = num++;
			}
		}
		System.out.println("Before:");
		TwoDArray.print2dArr1(test2);
		System.out.println("After:");
		mirrors(test2);
	}
	
	public static void mirrors(int[][] m) {
		for (int i = 0; i < m.length / 2; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = m[m.length - 1 - i][j];
			}
		}
		TwoDArray.print2dArr1(m);
	}
}
