import java.util.*;
public class RationalCalculator {

	public static void main(String[] args) {
		Rational r1 = new Rational();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Current global value: " + r1);

		outerLoop:
		while (true) {
			System.out.println("------------------------------------------------");
			System.out.println("                   Main Menu                    ");
			System.out.println("------------------------------------------------");
			System.out.println("c: change the current value");
			System.out.println("+: add a rational to the current value");
			System.out.println("-: subtract a rational from the current value");
			System.out.println("*: multiply by a rational to the current value");
			System.out.println("/: divide by a rational from the current value");
			System.out.println("q: quit");
			System.out.println("------------------------------------------------");
			System.out.print("enter a command: ");
			
			char command = scanner.nextLine().charAt(0);
			
			switch (command) {
				case 'c': {
					System.out.print("enter two integers for numerator and denominator: ");
					int n1 = scanner.nextInt();
					int n2 = scanner.nextInt();
					scanner.nextLine();
					r1 = new Rational(n1, n2);
					break;
				}
				case '+': {
					System.out.print("enter two integers for numerator and denominator of Rational to add: ");
					int n1 = scanner.nextInt();
					int n2 = scanner.nextInt();
					scanner.nextLine();
					Rational temp = new Rational(n1, n2);
					System.out.println(r1 + " + " + temp + " = " + Rational.add(r1, temp));
					r1 = Rational.add(r1, temp);
					break;
				}
				case '-': {
					System.out.print("enter two integers for numerator and denominator of Rational to subtract: ");
					int n1 = scanner.nextInt();
					int n2 = scanner.nextInt();
					scanner.nextLine();
					Rational temp = new Rational(n1, n2);
					System.out.println(r1 + " - " + temp + " = " + Rational.subtract(r1, temp));
					r1 = Rational.subtract(r1, temp);
					break;
				}
				case '*': {
					System.out.print("enter two integers for numerator and denominator of Rational to multipliy: ");
					int n1 = scanner.nextInt();
					int n2 = scanner.nextInt();
					scanner.nextLine();
					Rational temp = new Rational(n1, n2);
					System.out.println(r1 + " * " + temp + " = " + Rational.multiply(r1, temp));
					r1 = Rational.multiply(r1, temp);
					break;
				}
				case '/':{
					System.out.print("enter two integers for numerator and denominator of Rational to divide: ");
					int n1 = scanner.nextInt();
					int n2 = scanner.nextInt();
					scanner.nextLine();
					Rational temp = new Rational(n1, n2);
					System.out.println(r1 + " / " + temp + " = " + Rational.divide(r1, temp));
					r1 = Rational.divide(r1, temp);
					break;
				}
				case 'q': {
					System.out.println("thank you for using rational calculator");
					break outerLoop;
				}
				default: {
					System.err.println("invalid input");
					continue outerLoop;
				}
			}
			
			
			System.out.println("New global value: " + r1);
		}
		scanner.close();
	}
}
