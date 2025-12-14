/* Name : Surya Sreenivasan / 10
 * Date : 08/21/2024
 * Lab 2.1 Display Current Time
 */
import java.util.*;
public class Lab02_1 {

	public static void main(String[] args) {
		
		System.out.println("Entre the time offset: ");
		
		Scanner input = new Scanner(System.in);
		int offset = input.nextInt();
		input.close();
		
		long milliseconds = System.currentTimeMillis();

		long totalSeconds = milliseconds / 1000;
		
		int currentseconds = (int)(totalSeconds % 60);
		
		long  totalMinutes = totalSeconds / 60;
		
		int currentminutes = (int)(totalMinutes % 60);
		
		long totalHours = totalMinutes / 60;
		
		int currenthour = (int)(totalHours % 24);
		
		int realhour = currenthour + offset;
		
		System.out.println("Current time: " + realhour + ":" + currentminutes + ":" +  currentseconds);
				 
		
		

	}

}
