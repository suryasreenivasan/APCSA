import java.util.*;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] distinctNumbers = new int[10];
        int count = 0;
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            boolean isDistinct = true;
            for (int j = 0; j < count; j++) {
                if (number == distinctNumbers[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                distinctNumbers[count] = number;
                count++;
            }
        }
        scanner.close();
        Arrays.sort(distinctNumbers, 0, count);
        System.out.println("The number of distinct numbers: " + count);
        System.out.println("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(distinctNumbers[i] + " ");
        }
    }
    
    public static boolean exist(int n, int[] a) {
    	for (int i = 0; i < a.length; i++) {
    		if (n == a[i]) {
    			return true;
    		}
    	}
		return false;
    }
    
}
