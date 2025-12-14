/* Name : Surya Sreenivasan / 10
 * Date : 08/23/2024
 * Lab 2.8 Split Digits 
 */
import java.util.*;
public class Lab02_8 {
	// 1234
	public static void main(String[] args) {
			
			System.out.print("Enter 4 digit number: ");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			input.close();
			
			int d4 = num % 10;
			num /= 10; 
			int d3 = num % 10;
			num /= 10;
			int d2 = num % 10; 
			num /= 10; 
			int d1 = num %10;
			
			System.out.print("your number in reverse order is " + d4 + d3 + d2 + d1);
			
			
			
	}
}
