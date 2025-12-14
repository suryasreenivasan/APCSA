import java.util.*;
public class floatingpoint {

	public static void main(String[] args) {
		System.out.print("Enter a positive floating point number: ");
		Scanner scanner = new Scanner(System.in);
		double user = scanner.nextDouble();
		scanner.close();
		if (user < 0) {
			System.out.println("Invalid input. Negative Number.");
			System.exit((int)user);
		}
		String number = user + "";
		int digits = number.indexOf(".");
		
		System.out.println("The number of digits before the decimal point in " + user + " is " + digits);

	}

}
