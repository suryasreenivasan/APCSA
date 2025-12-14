// january the fifth
// equal
// reciprocla
public class Rational {
	
	private int numerator = 0;
	private int denominator = 1;
	
	public Rational() {
		
	}  
	
	public Rational(int n, int d) {
		if (d == 0) {
			System.err.println("denominator cannot be zero");
			System.exit(0);
		}
		numerator = n;
		denominator = d;
	}
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		
		return denominator;
		
	}
	
	public void setNumerator(int n) {
		
		numerator = n;
		
	}
	
	public void setDenominator(int d) {
		if (d == 0) {
			System.err.println("denominator cannot be zero");
			return;
		}
		denominator = d;
	}
	
	private static int getGCD(int n1, int n2) {
		n1 = Math.abs(n1);
		n2 = Math.abs(n2);
	
		while (n2 != 0) {
			int temp = n2;
			n2 = n1 % n2;
			n1 = temp;
		}
		return n1;
	}
	
	private Rational reduce() {
		int gcd = getGCD(numerator, denominator);
		int n = numerator / gcd;
		int d = denominator /gcd;
		return new Rational(n, d);
		
	}
	
	public static Rational add(Rational r1, Rational r2) {
		int d = r1.denominator * r2.denominator;
		int n = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
		
		return (new Rational(n, d)).reduce();
	}
	
	public static Rational multiply(Rational r1, Rational r2) {
		int d = r1.denominator * r2.denominator;
		int n = r1.numerator * r2.numerator;
		return (new Rational(n, d)).reduce();
	}
	
	public static Rational divide(Rational r1, Rational r2) {
		int d = r1.denominator * r2.numerator;
		int n = r1.numerator * r2.denominator;
		return (new Rational(n, d)).reduce();
	}
	public static Rational subtract(Rational r1, Rational r2) {
		int d = r1.denominator * r2.denominator;
		int n = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
		return (new Rational(n, d)).reduce();
	}
	
	public String toString() {
		if (numerator == 0 ) {
			return "0";
		}
		if (denominator == 1) {
			return Integer.toString(numerator);
		}
		
		return numerator + "/" + denominator;
	}
	
	public Rational power(int exponent) {
	    int newNumerator = (int)(Math.pow(numerator, exponent));
	    int newDenominator = (int)(Math.pow(denominator, exponent));
	    return new Rational(newNumerator, newDenominator).reduce();
	}
	
	
	public boolean equals(Object obj) {
		if (obj.getClass() != Rational.class) {
			return false;
		}
	    Rational a = this.reduce();
	    Rational b = ((Rational)(obj)).reduce();
	    return (a.numerator == b.numerator) && (a.denominator == b.denominator);
	}
	
	public Rational reciprocal() {
		if (numerator == 0) {
			System.err.println("this Rational cannot have a reciprocal");
			System.exit(0);
		}
		return new Rational(denominator, numerator);
	}
	
	public static Rational parse(String n) {
		char[] arr = n.toCharArray();
		int j = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '/') {
				j = i;
			}
		}
		if (j == -1) {
			System.err.println("invalid format");
			System.exit(0);
		}
		String numerator = n.substring(0, j);
		String denominator = n.substring(j + 1);
		int nu = Integer.parseInt(numerator);
		int du = Integer.parseInt(denominator);
		return new Rational(nu, du);
	}
	
	public static void main(String[] args) {
	/*
		Rational r = new Rational(1,0);
		System.out.println("r: " + r);
		Rational r1 = new Rational();
		System.out.println("r1: " + r1);
	*/
	/*
		Rational r2 = new Rational(4, 6);
		System.out.println("r2: " + r2);
		Rational r3 = new Rational(8, 6);
		System.out.println("r3: " + r3);
		System.out.println("r2 + r3 = " + Rational.add(r2, r3));
		System.out.println("r2 - r3 = " + Rational.subtract(r2, r3));
		System.out.println("r2 * r3 = " + Rational.multiply(r2, r3));
		System.out.println("r2 / r3 = " + Rational.divide(r2, r3));
		*/
		
		
		Rational r1 = Rational.parse("1/2");
		System.out.println(r1);
		Rational r2 = new Rational(2, 4);
		System.out.println(r1.equals(r2));
		System.out.println(r1.power(3));
		
	}
	
	
	
}