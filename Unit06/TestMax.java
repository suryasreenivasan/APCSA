import java.util.*;
public class TestMax { 

	public static void main(String[] args) {
		System.out.print("enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		System.out.print("enter another number: ");
		int num2 = scanner.nextInt();
		if (num1 == num2) {
			System.out.println("the numbers are the same value - " + num1);
			System.exit(0);
		}
		int max = findMax1(num1, num2);
	// int max = Math.max(num1, num2);
		scanner.close();
		System.out.println("the maximum number is " + max);
		//System.out.println("the maximum number is " + findMax1(num1, num2));
		//System.out.println("the maximum number is " + findMax2(num1, num2));
	}
	public static int findMax1(int n1, int n2) {
		if (n1 > n2) return n1; 
		else return n2;
	}
	
	/*
	public static int findMax2(int n1, int n2) {
		int result;
		if (n1 > n2) result = n1;
		else result = n2;
		return result;
	}
	*/

}
