import java.util.Scanner;

public class doWhileLoopPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int data; 
		int sum = 0;
		// do while loop makes it so your loop runs at least 1 time and for the first time
		// it runs it does not need to meet the while condition
		do {
			// sentinel view of zero
			System.out.println("Enter an integer. Input ends with 0: ");
			data = scanner.nextInt();
			sum += data;
		} while (data != 0);
		scanner.close();
		System.out.println("Sum: " + sum);
	}

}
