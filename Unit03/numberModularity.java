import java.util.*;
public class numberModularity {

	public static void main(String[] args) {
		
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		if (n % 5 == 0) {
			System.out.println("HiFive");
		}
		
		if (n % 2 == 0) {
			System.out.println("HiEven");
		}
	}

}
