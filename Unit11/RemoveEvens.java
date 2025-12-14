import java.util.*;
public class RemoveEvens {

	public static void main(String[] args) {
		ArrayList<Integer> hi = new ArrayList<>();
		 hi.add(1);
		hi.add(2);
		hi.add(2);
		hi.add(2);
		hi.add(3);
		hi.add(4);
		hi.add(4);
		hi.add(4);
		hi.add(1);
		
		
		/*
		hi.add(1);
		hi.add(2);
		hi.add(3);
		hi.add(2);
		hi.add(3);
		hi.add(4);
		hi.add(4);
		hi.add(4);
		hi.add(1);
		*/
		System.out.println(hi);
		removeEven(hi);
		System.out.println(hi);
		hi.sort(null);
		System.out.println(hi);
	}
	
	public static void removeEven(ArrayList<Integer> roblox) {
		for (int i  = roblox.size() - 1; i > 0 ; i--) {
			if (roblox.get(i) % 2 == 0) {
				roblox.remove(i);
				
			}
			
		}
	}

}
