import java.util.Scanner;
public class AdvancedSubtractionQuiz {

	public static void main(String[] args) {
		final int NUM_OF_QUESTIONS = 5;
		int count = 0;
		int n1, n2, answer;
		int correct = 0;
		long startTime = System.currentTimeMillis();
		String record = "";
		Scanner scanner = new Scanner(System.in);
		while (count < NUM_OF_QUESTIONS) {
			
			n1 = (int)(Math.random() * 10);
			n2 = (int)(Math.random() * 10);
			if (n1 < n2) {
				int temp = n1;
				n1 = n2;
				n2 = temp;
			}
			System.out.print("What is " + n1 + "-" + n2 + " =?: " );
			answer = scanner.nextInt();
			if (answer == (n1 - n2)) {
				System.out.println("correct");
				record += "\n" + n1 + "-" + n2 + " = " + answer + " - Correct";
				correct++;
			}
			else {
				System.out.println("Incorrect " + n1 + "-" + n2 + " = " + (n1-n2));
				record += "\n" + n1 + "-" + n2 + " = " + answer + " - Incorrect"; 
			}
			count++;
		}
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		scanner.close();
		System.out.println("------------");
		System.out.println("End of test. Test record: \n\n" + record + "\n\n");
		System.out.println(correct + "/5");
		System.out.println("Total time: " + totalTime/1000 + " seconds");
	}

}
