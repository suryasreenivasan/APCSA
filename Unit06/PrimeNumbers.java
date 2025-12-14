
public class PrimeNumbers {

	public static void main(String[] args) {
		int count = 0;
		for (int n = 1; n < 500; n++) {
			if (isPrime(n)) {
				count++;
			}
		}
		System.out.println("there are " + count + " prime numbers between [1, 500]");
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}

}
