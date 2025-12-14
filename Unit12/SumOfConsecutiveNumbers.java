import java.util.*;
public class SumOfConsecutiveNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = scanner.nextInt();
		System.out.println("sum of consecutive number from 1 to " + x +": " + sumOfNumbers(x));
		scanner.close();
		

	}
	
	public static int sumOfNumbers(int x) {
		if (x < 1) {
			return x;
		}
		else {
			return x + sumOfNumbers(x - 1);
		}
	}

}
