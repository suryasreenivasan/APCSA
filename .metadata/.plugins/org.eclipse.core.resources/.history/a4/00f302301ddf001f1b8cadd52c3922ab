
public class Recursive {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println(recursiveGCD1(x, y));
		System.out.println(palindrome("step on no pets"));
		
	}
	
	public static boolean palindrome(String str) {
		str = str.toLowerCase();
		boolean isPalindrome = true;
		if (str.length() == 1) {
			return true;
		}
		else if (!str.substring(0, 1).equals(str.substring(str.length() - 1))) {
			return false;
		}
		else {
			return palindrome(str.substring(1, str.length() - 1));
		}
		
	}
	
	public static int recursiveGCD1(int n1, int n2) {
		n1 = Math.abs(n1);
		n2 = Math.abs(n2);
		if (n2 == 0) {
			return n1;
		}
		return recursiveGCD1(n2, n1 % n2);
	}
	

}
