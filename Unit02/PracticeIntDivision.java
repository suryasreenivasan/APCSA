import java.util.*;
public class PracticeIntDivision {

	public static void main(String[] args) {
		
		
		System.out.println("Enter three numbers (integer) to average them");

		Scanner scanner = new Scanner(System.in);
		
		/* double n1 = 1;
		double n2 = 2;
		double n3 = 3;
		double average = ((n1 + n2 + n3)/3);
		System.out.println("Average: " + average);
		
		int n4 = 1;
		int n5 = 2;
		int n6 = 3;
		int intaverage = ((n4 + n5 + n6)/2);
		System.out.println("Average int: " + intaverage);
        */
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int average = ((num1 + num2 + num3) / 3);
		
		System.out.println(average + " is the average of your three numbers");
		scanner.close();
		
	}
	
}
