package dum;
import java.util.*;
public class random {

	public static void main(String[] args) {
			Random random = new Random();
			int count = 0;
			while (count < 100) {
			int n1 = random.nextInt(10)+1;
			System.out.println(n1);
			count++;
			}
	}

}
