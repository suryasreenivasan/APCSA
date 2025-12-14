
public class ForLoopPracice {

	public static void main(String[] args) {

		int sum = 0;
		String space = "";
		for (int i = 1; i <= 100; i++) {
			sum += i; 
			System.out.println(space + sum);
			space += " ";
		}   
		
	}

}
