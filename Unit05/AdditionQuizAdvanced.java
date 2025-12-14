import java.util.*;
public class AdditionQuizAdvanced {

	public static void main(String[] args) {
		int n1 = (int)(Math.random() * 10);
		int n2 = (int)(Math.random() * 10);
		System.out.print("What is "+ n1 + " + " +  n2 + "? ");
		Scanner scanner = new Scanner(System.in);
		int answer = scanner.nextInt();
		// System.out.println("me when skibidi bop bop bop bopo bopobpbopbopbopbopob \n ._.");
		while (answer != (n1 + n2)) {
			System.out.print("Incorrect try again.");
			System.out.print("\nWhat is "+ n1 + " + " +  n2 + "?");
			answer = scanner.nextInt();

		}
		scanner.close();
		System.out.println("good job.");
		
		
	}

}
