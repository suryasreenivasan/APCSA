import java.util.*;
public class DrawSomething {

	public static void main(String[] args) {
		System.out.print("enter size for a right triangle: ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		if (size > 100) {
			System.out.println("too big");
			System.exit(size);
		}
		scanner.close();
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
