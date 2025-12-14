	import java.util.Arrays;
public class Arr {

	public static void main(String[] args) {
		
		int[] arr = {1, 5, 23, 4, 7, 2};
		System.out.println(Arrays.toString(arr));
		Arr.insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
		
		
		int[] arr1 = RandomArrays.randomArray(200);
		System.out.println(Arrays.toString(arr1));
		Arr.insertionSort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		
		
	}
	
	public static int[] shiftToLeft(int[] a) {
		
		int[] result = new int[a.length];
		for(int i = 0; i < a.length - 1; i++) {
			result[i] = a[i+1];
		}
		result[a.length - 1] = a[0];
		return result;
	}
	
	public static void shiftOriginalLeft(int[] a) {
		int temp = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			a[i]= a[i + 1];
		}
		a[a.length - 1] = temp;
	}
	
	public static int[] shiftToRight(int[] a) {
		int[] result = new int[a.length];
		result[0] = a[a.length - 1];
		for(int i = a.length - 1; i > 0; i--) {
			result[i] = a[i - 1];
		}
		return result;
	}
	
	public static void shiftOriginalRight(int[] a) {
		int temp = a[a.length - 1];
		for (int i = a.length - 1; i > 0; i--) {
			a[i] = a[i-1];
		}
		a[0] = temp;
	}
	
	public static int linearSearch(int[] a, int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] a, int key) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = (high + low) / 2;
			if (key == a[mid]) {
				return mid;
			}
			else if (key > a[mid]) {
				low = mid + 1;
			}
			else if (key < a[mid]) {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void sortArray(double[] a) {
		
		for(int i = 0; i < a.length; i++) {
			double min = a[i];
			int indexMin = i;
			for (int j = i + 1; j < a.length; i++) {
				if (a[j] < min) {
					min = a[j];
					indexMin = j;
				}
			}
			a[indexMin] = a[i];
			a[i] = min;
		}
	
	}
	
	public static void insertionSort(int[] a) {
		
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j -= 1;
			}
			a[j + 1] = key;
		}
		
	}
	
	
}
