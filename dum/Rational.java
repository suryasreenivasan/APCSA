import java.util.*;
public class Rational {
	private int numerator = 0;
	private int denominator = 1;
	public Rational() {}
	public Rational(int a, int b) {
		if (b == 0) {
			System.exit(0);
		}
		numerator = a;
		denominator = b;
	}
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setNumerator(int newNumerator) {
		numerator = newNumerator;
	}
	public void setDenominator(int newDenominator) {
		if (newDenominator == 0) {
			System.out.println("NaN");

		}
		if (newDenominator != 0) {
			denominator = newDenominator;
		}
	}
	private int getGCD(int n1, int n2) {
	    int gcd = 1;
	    for (int k = 2; k <= n1 && k <= n2; k++) {
	        if (n1 % k == 0 && n2 % k == 0) {
	            gcd = k;
	        }
	    }
	    return gcd;
	}
	private Rational reduce() {
		int re = getGCD(numerator, denominator);
		int n = numerator / re;
		int d = denominator / re;
		return new Rational(n, d);
	}
	public static Rational add(Rational r1, Rational r2) {
		int d = r1.denominator * r2.denominator;
		int n = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
		return new Rational(n, d).reduce();
	}
	public static Rational subtract(Rational r1, Rational r2) {
		int d = r1.denominator * r2.denominator;
		int n = r1.numerator * r2.denominator - r1.denominator * r2.numerator;
		return new Rational(n, d).reduce();
	}
	public static Rational multiply(Rational r1, Rational r2) {
		int d = r1.denominator * r2.denominator;
		int n = r2.numerator * r1.numerator;
		return new Rational(n, d).reduce();
	}
	public static Rational divide(Rational r1, Rational r2) {
		int d = r1.denominator * r2.numerator;
		int n = r1.numerator * r2.denominator;
		return new Rational(n, d).reduce();
	}
	public String toString() {
		if (denominator == 1) {
			return numerator + "";
		}
		if (denominator == 0) {
			return "NaN - denominator cannot be zero. \nRational number not created.";
		}
		if (numerator == 0) {
			return "0";
		}
		return numerator + " / " + denominator;
		
	}

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rational global = new Rational();
        System.out.println("Current global value: " + global);

        String command;

        while (true) {
            displayMenu();
            System.out.print("Enter a command: ");
            command = input.nextLine();

            if (command.equals("c")) {
                System.out.print("Enter 2 integers for numerator & denominator: ");
                int numerator = input.nextInt();
                
                int denominator = input.nextInt();
           
                global.setNumerator(numerator);
                global.setDenominator(denominator);
                System.out.println("New global value: " + global);
            } else if (command.equals("+")) {
                System.out.print("Enter 2 integers for numerator & denominator: ");
                int numerator = input.nextInt();
             
                int denominator = input.nextInt();
              
                Rational other = new Rational(numerator, denominator);
                global = Rational.add(global, other);
                System.out.println("New global value: " + global);
            } else if (command.equals("-")) {
                System.out.print("Enter 2 integers for numerator & denominator: ");
                int numerator = input.nextInt();
                
                int denominator = input.nextInt();
             
                Rational other = new Rational(numerator, denominator);
                global = Rational.subtract(global, other);
                System.out.println("New global value: " + global);
            } else if (command.equals("*")) {
                System.out.print("Enter 2 integers for numerator & denominator: ");
                int numerator = input.nextInt();
               
                int denominator = input.nextInt();
          
                Rational other = new Rational(numerator, denominator);
                global = Rational.multiply(global, other);
                System.out.println("New global value: " + global);
            } else if (command.equals("/")) {
                System.out.print("Enter 2 integers for numerator & denominator: ");
                int numerator = input.nextInt();
           
                int denominator = input.nextInt();
           
                Rational other = new Rational(numerator, denominator);
                global = Rational.divide(global, other);
                System.out.println("New global value: " + global);
            } else if (command.equals("q")) {
                System.out.println("Goodbye.");
                input.close();
                return;
            } else {
                System.out.println("Invalid command.");
            } input.nextLine();
            
        }
    }



    public static void displayMenu() {
        System.out.println("----------------------------------------");
        System.out.println("              Main Menu                 ");
        System.out.println("----------------------------------------");
        System.out.println("c: Change the current value"
                + "\n+: Add a Rational to the current value"
                + "\n-: Subtract a Rational from the current value"
                + "\n*: Multiply by a Rational to the current value"
                + "\n/: Divide by a Rational from the current value"
                + "\nq: Quit");
        System.out.println("----------------------------------------");
    }
}