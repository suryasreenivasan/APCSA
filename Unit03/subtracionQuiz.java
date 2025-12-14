import java.util.*; 
public class subtracionQuiz {

	public static void main(String[] args) {

		int n1 = (int)(Math.random()*10);
		int n2 = (int)(Math.random()*10);
		
		if (n1<n2) {
			int temp = n1; 
			n1 = n2; 
			n2 = temp;
		}
		
		System.out.print("What is " + n1 + " - " + n2 + " = ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		input.close();
		
		System.out.println(n1 + " - "  + n2 + " = " + answer + " is " + (answer==(n1-n2)));
		
		if (answer!=(n1-n2)) {
			
			System.out.println(n1 + " - " + n2 + " = " + (n1-n2)); 
		}
	}

}
