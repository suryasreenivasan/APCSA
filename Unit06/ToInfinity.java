
public class ToInfinity {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 100000; i++) {
			int dice = Crap.getDice();
			if (dice == 7 || dice == 11) {
				count++;
			}
			else if (dice == 2 || dice == 3 || dice == 12 ) {
				
			}
			else {
				int point = dice;
				do {
					dice = Crap.getDice();
				} while (dice != point && dice != 7);
				if (point == dice) {
					count++;
				}
			}
			
		}
		System.out.println("Number of winning out of 100000 plays: " + count + "\nProbability of winning " + (count / 100000.0));

	}

}
