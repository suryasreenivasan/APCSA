import java.util.*;
// 4
// 40 55 70 58
public class AssignGrades {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("how many students are there? ");
		int students = scanner.nextInt();
		System.out.print("what r grades: ");
		double[] scores = new double[students];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scanner.nextDouble();
			
		}
		scanner.close();
		
		double bestScore = maximumArray(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.print("student " + i + ": score "+ scores[i] + " grade: ");
			if (scores[i] >= bestScore - 10) {
				System.out.print("A");
				System.out.println();
			}
			else if (scores[i] >= bestScore - 20) {
				System.out.print("B");
				System.out.println();
			}
			else if (scores[i] >= bestScore - 30) {
				System.out.print("C");
				System.out.println();
			}
			else if (scores[i] >= bestScore - 40) {
				System.out.print("D");
				System.out.println();
			}
			else {
				System.out.print("F");
				System.out.println();
			}
		}
		
	}
	
	public static double maximumArray(double[] a) {
		double max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

}
