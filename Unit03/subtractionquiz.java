 
public class subtractionquiz {
		public static void main(String[] args) {
			
			int n1 = (int)(Math.random()*10);
			int n2 = (int)(Math.random()*10);
			
			if (n1<n2) {
				int temp = n1;
				n1 = n2;
				n2 = temp; 
			}
			
			System.out.println("What is " + n1 + " - " + n2 + " ?");
		}
}
