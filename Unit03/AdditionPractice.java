import java.util.*;
public class AdditionPractice {

	public static void main(String[] args) {
		// (int)Math.random()*(max-min+1)) + min;
		int n1 = (int)(Math.random()*10);
		int n2 = (int)(Math.random()*10);
		System.out.print("What is " + n1 + " + " + n2 + "? ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		System.out.println(n1 + " + " + n2 + " = " + number + " is " + (number==(n1+n2)));
		
			
	}
}
