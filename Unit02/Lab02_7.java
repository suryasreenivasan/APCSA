/* Name : Surya Sreenivasan / 10
 * Date : 08/23/2024
 * Lab 2.7 Sum of the digits in an integer
 */
import java.util.*;
public class Lab02_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//932 
		System.out.print("Enter an integer between 0 and 1000: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		
		int sum = 0;
		int digit = num % 10;
		sum += digit;
		num /= 10;
		
		digit = num % 10; 
		sum += digit;
		num /= 10;
		
		digit = num % 10; 
		sum += digit;
		num /= 10;
		
		System.out.println("the sum of digits are: " + sum);
		
	}

}
