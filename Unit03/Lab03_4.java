/* Name : Surya Sreenivasan / 10
 * Date : 09/05/2024
 * Lab 3.4 Sort 3 Integers 
 */
import java.util.*;
public class Lab03_4 {

	public static void main(String[] args) {
	
		System.out.print("Enter three integers: ");
		
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		input.close();
		
		if (n1>n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		if (n2>n3) {
			int temp = n2;
			n2 = n3;
			n3 = temp;
		}
		
		if (n1>n2) {
			int temp= n1;
			n1 = n2;
			n2 = temp;
		}
		
		System.out.println(n1 + " " + n2 + " " + n3 +" ");
		

	}

}
