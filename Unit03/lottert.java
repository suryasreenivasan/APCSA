import java.util.*;
public class lottert {

	public static void main(String[] args) {
			
		int lottery = (int)(Math.random()*100); 
		// int lottery = 77; 
		int lotteryD1 = lottery % 10; 
		int lotteryD2 = lottery / 10; 
		
		System.out.print("Enter your lottery pick (2 digits): ");
		
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		input.close();
		
		int guessD1 = guess % 10;
		int guessD2 = guess / 10;
		
		System.out.println("the lottery number is: " + lottery);
		if (lottery == guess) {
			System.out.println("Exact Match: You win $10000!");
		}
		else if (guessD1 == lotteryD2 && guessD2 == lotteryD1) {
			System.out.println("Flipped match! - $3000");
		}
		else if (guessD1 == lotteryD1 || guessD2 == lotteryD2 || guessD1 == lotteryD2 || guessD2 == lotteryD1) {
			System.out.println("Match one digit - $1000");
		}
		else {
			System.out.println("Do better.");
		}
	}

}
