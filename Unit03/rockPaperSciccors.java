import java.util.*;
public class rockPaperSciccors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
		try {	System.out.print("Rock(0), Paper(1), Scissors(2), Exit(stop): ");
			
				int user = scanner.nextInt();
			
			int computer = (int)(Math.random()*3);
			// System.out.println("computer's number - " + computer );
			if (user != 0 && user != 1 && user != 2) {
				System.out.println("Error: Invalid Input.");
			}
		
			System.out.print("You: ");
			if (user == 0 ) {
				System.out.print("Rock");
			}
			else if (user == 1) {
				System.out.print("Paper");
			}
			else {
			System.out.print("Scissors");
			}
		
			System.out.print(" --- Computer: ");
			if (computer == 0) {
	    		System.out.print("Rock");
	    	}
	    	else if (computer == 1) {
	    		System.out.print("Paper");
	    	}
	    	else {
	    		System.out.print("Scissors");
	    	}
		
	    	if (user == computer) {
        		System.out.print(". Draw.");
        	} 
        	else if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) { 
        	System.out.print(". You win.");
        	} 
        	else {
            	System.out.print(". Computer Wins.");
        	} 
	    	System.out.println();
		}
		catch (Exception e) {
			System.out.println("broken, just like your heart");break;
		}
		}
		scanner.close();
    
	}
}
