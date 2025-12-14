import java.util.*;
public class Merge {

	public static void main(String[] args) {
		int[] a = {4, 5, 6, 7, 8, 9};
		System.out.println("array a: " + Arrays.toString(a));
		int[] b = {1, 2, 3, 4};
		System.out.println("array b: " + Arrays.toString(b));
		System.out.println("merged array: ");
		System.out.println(Arrays.toString(merge(a, b)));

	}
	
	public static int[] merge(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		
		int i = 0, j = 0, indx = 0;
		while (j < b.length && i < a.length) { 
			if (a[i] > b[j]) {
				result[indx++] = b[j++];
			}
			else {
				result[indx++] = a[i++];
			}
		}
		
		while (i < a.length) {
				result[indx++] = a[i++];
		}
		while (j < b.length) {
				result[indx++] = b[j++];
		}
		 
		 
		
		/*
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			result[i + a.length] = b[i];
		}
		Arrays.sort(result);
		*/
		return result;
	}

}
