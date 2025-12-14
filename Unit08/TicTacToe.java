import java.util.*;
public class TicTacToe {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        String p1 = "X";
        String p2 = "O";
        boolean done = false;
        boolean turn;
        double starter;
        String decision;
        do{
            System.out.println("Welcome to Tic Tac Toe!");
            String[][] board = {{" "," "," "},{" "," "," "},{" "," "," "}};
            starter = Math.random();
            turn = (starter >= 0.5);
            do{
                displayBoard(board);
                if (turn){
                    makeMove(board, p1);
                    turn = false;
                    if (win(p1,board)){
                        displayBoard(board);
                        System.out.println("Player X wins!");
                        done = true;
                    }
                }
                else {
                    makeMove(board, p2);
                    turn = true;
                    if (win(p2,board)){
                        displayBoard(board);
                        System.out.println("Player O wins!");
                        done = true;
                    }

                }
                if (draw(board) == true){
                    System.out.println("It is a draw!");
                    done = true;
                }
            }while(done == false);
            System.out.print("Continue Playing? (y or n): ");
            decision = input.next();
        }while(decision.equals("y"));
    }

    public static void displayBoard(String[][] b){
        String game = String.format("""
                -------------
                | %s | %s | %s |
                -------------
                | %s | %s | %s |
                -------------
                | %s | %s | %s |
                -------------""",b[0][0],b[0][1],b[0][2],b[1][0],b[1][1],b[1][2],b[2][0],b[2][1],b[2][2]);
        System.out.println(game);
    }

    public static void makeMove(String[][] b, String p){
        String promptRow = String.format("Player %s - Enter Row (0, 1, or 2): ", p);
        String promptColumn = "Column (0, 1, or 2): ";
        boolean valid = false;
        do{
            System.out.print(promptRow);
            int row = input.nextInt();
            System.out.print(promptColumn);
            int column = input.nextInt();
            if (row > 2 || column > 2){
                System.out.println("Row and/or Column is invalid, please try again.");
                continue;
            }
            if (b[row][column] == " "){
                b[row][column] = p;
                valid = true;
            }
            else {
                System.out.println("Cell is occupied, please try again.");
            }
        }while (valid == false);

    }

    public static boolean win(String p, String[][] b){
        boolean won = false;
        if (b[0][0] == p && b[0][1] == p && b[0][2] == p){
            won = true;
        }
        else if (b[1][0] == p && b[1][1] == p && b[1][2] == p) {
            won = true;
        }
        else if (b[2][0] == p && b[2][1] == p && b[2][2] == p) {
            won = true;
        }
        else if (b[0][0] == p && b[1][0] == p && b[2][0] == p) {
            won = true;
        }
        else if (b[0][1] == p && b[1][1] == p && b[2][1] == p) {
            won = true;
        }
        else if (b[0][2] == p && b[1][2] == p && b[2][2] == p) {
            won = true;
        }
        else if (b[0][0] == p && b[1][1] == p && b[2][2] == p) {
            won = true;
        }
        else if (b[0][2] == p && b[1][1] == p && b[2][0] == p) {
            won = true;
        }

        return won;

    }

    public static boolean draw(String[][] b){
        boolean draw = true;
        int empty = 0;
        for (String[] i:b){
            for (String j:i){
                if (j == " "){
                    empty++;
                }
            }
        }
        if (empty > 0){
            draw = false;
        }
        return draw;
    }
}
