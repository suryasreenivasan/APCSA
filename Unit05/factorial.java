import java.util.*;
public class factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("integer to find factorial for (dont make it too big): ");
		long factorial = scanner.nextLong();
		scanner.close();
		long result = 1;
		for (; factorial >= 1; factorial--) {
			result *= factorial;
		}
		System.out.println(result);
		

	}

}
