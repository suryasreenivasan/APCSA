// -2.3 5.0 8.1 0.0 6.7 4.0 -6.2 5.5 4.2
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("before bubble sort: ");
		double[] arr = {-2.3, 5.0, 8.1, 0.0, 6.7, 4.0, -6.2, 5.5, 4.2, 10.0};
		System.out.println(Arrays.toString(arr));
		System.out.println("after bubble sort: ");
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.print("is it sorted? ");
		System.out.println(isSorted(arr));
		
		
	}
	public static void bubbleSort(double[] bubble) {
		for (int i = 0; i < bubble.length - 1; i++) {
			for (int j = 0; j < bubble.length - 1 - i; j++) {
				if (bubble[j] > bubble[j + 1]) {
					double temp = bubble[j];
					bubble[j] = bubble[j + 1];
					bubble[j + 1] = temp;
				}
			}
		}
	}
	
	public static boolean isSorted(double[] bubble) {
		double[] checker = new double[bubble.length];
		for (int i = 0; i < bubble.length; i++) {
			checker[i] = bubble[i];
		}
		Arrays.sort(checker);
		if (Arrays.equals(checker, bubble)) {
			return true;
		}
		return false;
	}
}
