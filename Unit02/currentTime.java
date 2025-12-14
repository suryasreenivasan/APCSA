import java.util.*;
public class currentTime {

	public static void main(String[] args) {
		
		long milliseconds = System.currentTimeMillis();

		long totalSeconds = milliseconds / 1000;
		
		long currentseconds = totalSeconds % 60;
		
		long  totalMinutes = totalSeconds / 60;
		
		long currentminutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currenthour = totalHours % 24;
		System.out.println("wanna know the current GMT time (sure/naw)");
		
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		scanner.close();
		
		if (a.equalsIgnoreCase("sure")) { 
		
		
		System.out.println("the current GMT time is: " + currenthour + ":" + currentminutes + ":" + currentseconds);
		
		
		System.out.println("wanna know mst (sure / naw)");
		
		Scanner input = new Scanner(System.in);
		
		String b = input.next();
		input.close();
		
		if  (b.equalsIgnoreCase("sure")) {
			
		long msthour = (currenthour - 7 + 24) % 24;
			
		System.out.println("The current MST time is: " + msthour + ":" + currentminutes + ":" + currentseconds);
			
			
		}
				
		else {
			System.out.println("Program Terminated");
			System.exit(0);
		}
		
		}
		
		else {
			System.out.println("Program Terminated");
			System.exit(0);
		}
		
	}

}
