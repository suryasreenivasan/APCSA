import java.util.*;

public class Result {

	public static void main(String[] args) {
		/*
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(4);
		list1.add(4);
		list1.add(1);
		System.out.println(list1);
		System.out.println(getDistinct(list1));
		System.out.println(list1);
		*/
		ArrayList<Integer> hi = new ArrayList<Integer>();
		hi.add(1);
		hi.add(1);
		hi.add(1);
		hi.add(2);
		hi.add(3);
		hi.add(4);
		hi.add(1);
		hi.add(1);
		hi.add(2);
		hi.add(3);
		hi.add(1);
		System.out.println(hi);
		removeDuplicateV1(hi);
		System.out.println(hi);
		hi.sort(null);
		System.out.println(hi);
	}
	
	public static ArrayList<Integer> getDistinct(ArrayList<Integer> list) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (!result.contains(list.get(i))) {
				result.add(list.get(i));
			}
		}
		return result;
	}
	
	public static void removeDuplicateV1(ArrayList<Integer> intList) {
		for (int i = intList.size(); i >= 0; i--) {
			int g = i + 1;
			while (g < intList.size()) {
				if (intList.get(i) == intList.get(g)) {
					intList.remove(i);
				}
				else g++;
			}
		}
	}
}
