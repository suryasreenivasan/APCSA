import java.util.*;
public class PalinDrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a string: ");
		String input = scanner.nextLine();
		scanner.close();
		if (isPalindrome(input)) {
			System.out.println(input + " is a palindrome");
		}
		else {
			System.out.println(input + " is not a palindrome");
		}
	}
	
	
	public static String reverseStr(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.substring(i, i +1);
		}

		return result;
		
	}
	
	public static boolean isPalindrome(String str) {
		
		return str.toLowerCase().equals(reverseStr(str).toLowerCase());
		
	}

}
