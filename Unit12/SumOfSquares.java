import java.util.*;
public class SumOfSquares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a number: ");
		int x = scanner.nextInt();
		System.out.println("sum of squares for " + x + ": " + sum(x));
		scanner.close();
	}
	
	public static int sum(int n) {
		if (n == 1) {
			return n;
		}
		else {
			return n * n + sum(n - 1);
		}
	}

}
