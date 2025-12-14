// for each loop

public class Array {

	public static void main(String[] args) {
		
		int[] arr1 = new int[10];
		for (int i = 0; i < (arr1.length); i++) {
			arr1[i] = i + 1;
			
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int e: arr1) {
			System.out.print(e + " ");
		}
		
	}

}
