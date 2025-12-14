import java.util.*;
public class secondstominutes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter seconds: ");
		int seconds = input.nextInt();
		input.close();
		int min = seconds / 60;
		int seconds_left = seconds % 60;
		System.out.println(seconds + " seconds is " + min + " minutes " + seconds_left + " seconds" );
			int x = 20; int y = 40;
			System.out.println(x+y); System.out.println(x + "" + y); System.out.println("apple"+y+x);
	}

}