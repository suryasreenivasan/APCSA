import java.util.*;
public class TestStopwatch {
	
	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		int size = 100000;
		int[] arr = createArr(size);
		sw.start();
		// Arrays.sort(arr);
		selectionSort(arr);
		sw.stop();
		System.out.println("It took " + sw.getElapsedTime() + " ms to sort the array");	
	}
	
	public static int[] createArr(int n) {
		int[] result = new int[n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			result[i] = random.nextInt(100);
		}
		return result;
	}
	
	public static void selectionSort(int[] list) {
		for (int i  = 0; i < list.length; i++) {
			int min = list[i];
			int indexMin = i;
			for(int j = i + 1; j < list.length; j++) {
				if (list[j] < min) {
					min = list[j];
					indexMin = j;
				}
			}
			if (list[i] != min) {
				int temp = list[i];
				list[i] = min;
				list[indexMin] = temp;
			}
		}
	}
}
 	