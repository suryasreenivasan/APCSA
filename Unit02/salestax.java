import java.util.*;
public class salestax {

	public static void main(String[] args) {
		
		System.out.print("Enter sales tax in %");
		Scanner input = new Scanner(System.in);
		double salestax = input.nextDouble() / 100;
		
		System.out.print("Enter Sale amount in $");
		double saleamount = input.nextDouble();
		input.close();
		
		double salestaxamount = (int)(saleamount * salestax * 100 + 0.5) / 100.0;
		
		System.out.println("Sales tax in $ is " + salestaxamount);
	}

}
