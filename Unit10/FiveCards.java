import java.util.*;

public class FiveCards {
	
	public static final int NUMBER_OF_CARDS = 5;
	private Card[] cards = new Card[5];
	private int changes;
	private int score;
	private String history = "";
	
	public FiveCards() {
		int count = 0;

		while (count < 5) {
			Card newCard = Card.pickACard();
	        boolean isDuplicate = false;
	            
	        for (int i = 0; i < count; i++) {
	        	if (newCard.equals(cards[i])) {
	        		isDuplicate = true;
	        		break;
	        	}
	        }
	            
	        if (!isDuplicate) {
	        	cards[count] = newCard;
	            count++;
	        }
	    }
		changes = 0;
		score = 0;
		history += Arrays.toString(cards) + "\n";
	}
	
	public void changeOne(int x) {
		try {
			cards[x - 1] = Card.pickACard();
			history += "Card changed at " + x + "\n" + Arrays.toString(cards) + "\n";
			changes++;
			System.out.println(Arrays.toString(cards));
		} 
		catch(Exception e) {
			System.err.print("please enter a valid number (1-5)");
			System.out.println("your card was not changed");
			return;
		}
	}
	
	public int countPairs(int r) {
        int count = 0;
        for (int i = 0; i < NUMBER_OF_CARDS - 1; i++) {
            for (int j = i + 1; j < NUMBER_OF_CARDS; j++) {
                if (cards[i].getRank() == r && cards[j].getRank() == r) {
                    count++;
                }
            }
        }
        return count;
    }
	
	public void computeScore() {
		
	    int[] ranks = new int[NUMBER_OF_CARDS];
	    String[] suits = new String[NUMBER_OF_CARDS];
	    for (int i = 0; i < NUMBER_OF_CARDS; i++) {
	        ranks[i] = cards[i].getRank();
	        suits[i] = cards[i].getSuit();
	    }
	    Arrays.sort(ranks);
	    
	    int[] rankCount = new int[13];
	    for (int rank : ranks) {
	        rankCount[rank - 1]++;
	    }

	    boolean isFlush = true;
	    for (int i = 1; i < 5; i++) {
	        if (!suits[i].equals(suits[0])) {
	            isFlush = false;
	            break;
	        }
	    }

	    boolean isStraight = true;
	    for (int i = 1; i < NUMBER_OF_CARDS; i++) {
	        if (ranks[i] != ranks[i - 1] + 1) {
	            isStraight = false;
	            break;
	        }
	    }
	    if (ranks[0] == 1 && ranks[1] == 10 && ranks[2] == 11 && ranks[3] == 12 && ranks[4] == 13) {
	        isStraight = true;
	    }

	    int maxCount = 0, secondMaxCount = 0;
	    for (int i = 0; i < rankCount.length; i++) {
	        int count = rankCount[i];
	        if (count > maxCount) {
	            secondMaxCount = maxCount;
	            maxCount = count;
	        } else if (count > secondMaxCount) {
	            secondMaxCount = count;
	        }
	    }

	    if (isFlush && isStraight) {
	        score = 8;
	    } 
	    else if (maxCount == 4) {
	        score = 7; 
	    } 
	    else if (maxCount == 3 && secondMaxCount == 2) {
	        score = 6; 
	    } 
	    else if (isFlush) {
	        score = 5; 
	    } 
	    else if (isStraight) {
	        score = 4;
	    } 
	    else if (maxCount == 3) {
	        score = 3;
	    } 
	    else if (maxCount == 2 && secondMaxCount == 2) {
	        score = 2; 
	    } 
	    else if (maxCount == 2) {
	        score = 1;
	    } 
	    else {
	        score = 0; 
	    }

	    
	    history += "Score: " + score + "\n";
	}

	
	public int getScore() {
		computeScore();
		return score;
	}
	
	public int getChanges() {
		return changes;
	}
	
	@Override 
	public String toString() {
		return Arrays.toString(cards);
	}
	
	public String getHistory() {
		return history;
	}
		
		
	
	public static void main(String[] args) {
		
		FiveCards myCards = new FiveCards();
		System.out.println(myCards);
		myCards.computeScore();
		myCards.changeOne(1);
		myCards.computeScore();
		myCards.changeOne(5);
		myCards.computeScore();
		System.out.println("\nHistory:\n" + myCards.getHistory());
		
	}
	
	
}
