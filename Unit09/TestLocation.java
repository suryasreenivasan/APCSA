
public class TestLocation {

	public static void main(String[] args) {
		int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 20, 9}};
		System.out.println(findMaxLocation(mat));

	}
	
	public static Location findMaxLocation(int[][] m) {
		Location maxLocation = new Location();
		maxLocation.maxValue = m[0][0];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j <  m[i].length; j++) {
				if (m[i][j] > maxLocation.maxValue) {
					maxLocation.row = i;
					maxLocation.column = j;
					maxLocation.maxValue = m[i][j];
				}
			}
		}
		return maxLocation;
	}

}
