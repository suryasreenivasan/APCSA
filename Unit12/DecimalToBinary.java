// 10 to binary: 1010
import java.util.*;
public class DecimalToBinary {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(x + " to binary: " + decimalToBinary(x));
		scanner.close();
		System.out.println(Integer.toBinaryString(x));
		
	}
	
	public static String decimalToBinary(int x) {
		if (x == 0) {
			return "0";
		} else if (x == 1) {
			return "1"; } else {
		
			return decimalToBinary(x / 2) + (x % 2) + "";
		}
		
	}

}
