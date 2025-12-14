import java.util.*;
public class LetterGrade {

	public static void main(String[] args) {
	
		try {
			System.out.print("What is your grade? ");
			Scanner scanner = new Scanner(System.in);
			double grade = scanner.nextDouble();
			scanner.close();
			System.out.print("Letter grade: "); printGrade(grade);
			// Scanner.out.print("Letter grade: " + printGrade(grade));
			// you cannot do this because printGrade does not return a value!!
			// return; return; return; return; return; return; return; return; return; 
		}
		catch (Exception e) {
			System.out.println("error - enter a number next time");
		}

	}
	
	public static void printGrade(double score) {
		if (score >= 90) {
			System.out.println("A");
		}
		else if (score >= 80) {
			System.out.println("B");
		}
		else if (score >= 70) {
			System.out.println("C");
		}
		else if (score >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
