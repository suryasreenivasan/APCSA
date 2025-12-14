import java.util.*;
public class stringInput {

	public static void main(String[] args) {
		System.out.println("Enter three words seperated by spaces: ");
		Scanner input = new Scanner(System.in);
		String s1 = input.next();
		String s2 = input.next();
		String s3 = input.next();
		System.out.println(s1 + s2 + s3);
		// each word will be taken as different string
		// take input until space
		input.nextLine();
		// to remove new line character 
		System.out.println("Enter a sentence: ");
		String s = input.nextLine();
		input.close();
		System.out.println("Your sentence was: " + s);
		// take input until java sees space
		
		String x1 = new String("welcome");
		String x2 = "welcome";
		String x3 = new String("welcome");
		String x4 = "welcome";
		System.out.println(x1==x2);
		System.out.println(x1==x3);
		System.out.println(x2==x4);
		// false false true
		
		

	}

}
