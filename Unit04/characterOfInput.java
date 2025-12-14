import java.util.*;
public class characterOfInput {

	public static void main(String[] args) {
		System.out.print("Enter: ");
		Scanner scanner = new Scanner(System.in);
		String user = scanner.nextLine().substring(0,1);
		scanner.close();
		
		if (user.equals("Y") || user.equals("y")) {
			System.out.println("Move on.");
		}
		else if (user.equals("N") || user.equals("N")) {
			System.out.println("Cancel.");
		}
		else {
			System.out.println("Review.");
		}
		

	}

}
