/* Name : Surya Sreenivasan / 10
 * Date : 09/05/2024
 * Lab 3.5 Number of days in a month
 */
// 2 2020, 3 2014
import java.util.*;
public class Lab03_5 {

	public static void main(String[] args) {
		System.out.print("Enter a month as an integer and a year: ");
		
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		int year = input.nextInt();
		input.close();
		
		int daysInAMonth = 0;
		boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12 ) {
			daysInAMonth = 31; 
		}
		
		else if (month == 2) {
			if (isLeapYear == true) {
				daysInAMonth = 29;
			}
			else {
				daysInAMonth = 28;
			}
		}
		else {
			daysInAMonth = 30;
		}
		
		System.out.println(month + "/" + year + " has " + daysInAMonth + " days");
			
		

	}

}
