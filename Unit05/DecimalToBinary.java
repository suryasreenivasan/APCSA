// 10 - 1010
// 012 - 1100
// 123
// 500
import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.print("Enter a decimal number: ");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		scanner.close();
		String binary = "";
		if (user == 0) {
			binary = "0";
		}
		while (user > 0) {
			binary = (user % 2) + binary;
			user /= 2;
		}
		
		System.out.println("Binary value: " + binary);
		
	}

}
