import java.util.Arrays;

public class LockerPuzzle {

    public static void main(String[] args) {
        
        boolean[] lockers = new boolean[100];
        
        for (int i = 1; i <= lockers.length; i++) {
            for (int j = i - 1; j < lockers.length; j += i) {
            	if (lockers[j] == true) {
            		lockers[j] = false;
            	}
            	else {
            		lockers[j] = true;
            	}
            }
        }
        
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.println("locker #" + (i + 1) + " is open");
            }
        }
        
        System.out.println(Arrays.toString(lockers));
    }
}
