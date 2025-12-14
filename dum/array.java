import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); 
        scanner.nextLine();
        String[] blocks = new String[4];
        for (int i = 0; i < 4; i++) {
            blocks[i] = scanner.nextLine();
        }
        
        for (int i = 0; i < number; i++) {
            String word = scanner.nextLine();
            if (canSpell(word, blocks)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
    
    public static boolean canSpell(String word, String[] blocks) {
        boolean[] used = new boolean[4];
        return canFormWord(word, blocks, used, 0);
    }
    // index is the position of the letter were trying to match
    private static boolean canFormWord(String word, String[] blocks, boolean[] used, int index) {
        if (index == word.length()) return true;
        
        char letter = word.charAt(index);
        //blocks
        for (int i = 0; i < 4; i++) {
            if (!used[i] && blocks[i].indexOf(letter) != -1) {
                used[i] = true;
                //check next letter
                if (canFormWord(word, blocks, used, index + 1)) {
                    return true;
                }
                //backtrack
                used[i] = false; 
            }
        }
        
        return false;
    }
}
