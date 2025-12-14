import java.util.*;

public class Practice3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle (integer): ");
		
		double radius = input.nextDouble();
		
		input.close();
		
		double area = radius * radius * 3.14;
		
		System.out.println("The area of a circle with radius " + radius + " is " + area);
		
		
	}

}