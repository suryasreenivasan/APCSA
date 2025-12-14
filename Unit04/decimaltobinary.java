/* Name : Surya Sreenivasan / 10
 * Date : 09/18/2024
 * Lab 4.6 decimal to binary
 */
// 15 - 1111
// 11 - 1011
// 16 - invalid input 
// 0 - 0000
import java.util.*;
public class decimaltobinary {

	public static void main(String[] args) {
		System.out.print("Enter integer between 0 and 15: ");
		Scanner scanner = new Scanner(System.in);
		String binary = "";
		int decimal = scanner.nextInt();
		scanner.close();
		if (decimal > 15 || decimal < 0) {
			System.out.println("Invalid input.");
			System.exit(decimal);
		}
		else {
		binary = (decimal % 2) + binary;
		decimal /= 2;
		binary = (decimal % 2) + binary;
		decimal /= 2;
		binary = (decimal % 2) + binary;
		decimal /= 2;
		binary = (decimal % 2) + binary;
		decimal /= 2;
		
		}
		System.out.println("in Binary: " + binary);
	}

}
