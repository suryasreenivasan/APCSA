import java.util.Scanner;
public class GuessingNumber {

	public static void main(String[] args) {
		System.out.println("guess a number between zero and a hundred");
		int computerRandom = (int)(Math.random()*100) + 1;
		Scanner scanner = new Scanner(System.in);
		int guess = scanner.nextInt();
		while (computerRandom != guess) {
			if (guess < computerRandom) {
				System.out.print("The number is higher, ");
			}
			else {
				System.out.print("The number is lower, ");
			}
			System.out.println("try again");
			guess = scanner.nextInt();
		}
		scanner.close();
		System.out.println("you guessed it; the number was " + computerRandom);
	}

}
