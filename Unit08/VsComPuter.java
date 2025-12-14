// play against the computer

import java.util.*;

public class VsComPuter {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("play tictactoe!");
        deLay(1000);
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        boolean won = false;
        int turn = 0;
        char[] players = new char[2];
        if (Math.random() > 0.5) {
            players[0] = 'X';
            players[1] = 'O';
        } else {
            players[0] = 'O';
            players[1] = 'X';
        }
        System.out.println("First player (Human) is " + players[0]);
        System.out.println("Second player (Robot) is " + players[1]);
        deLay(3000);
        while (!won) {
            displayBoard(board);
            char player = players[turn % 2];
            if (turn % 2 == 1) {
            	System.out.println("Robot is moving...");
            	deLay(3000);
                robotMove(board, player);
            } else {
                makeMove(board, player);
            }
            if (win(board, player)) {
                displayBoard(board);
                if (player == players[1]) {
                	System.out.println("Robot wins!");
                }
                else {
                	System.out.println("Human wins!");
                }
                break;
            }
            draw(board);
            turn++;
        }
    }

    public static void displayBoard(char[][] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.print("\n-------------\r\n");
            System.out.print("|");
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(" " + c[i][j] + " |");
            }
        }
        System.out.print("\n-------------\r\n");
    }

    public static void makeMove(char[][] c, char player) {
        boolean real = true;
        while (real) {
            System.out.println();
            System.out.println("Player " + player + "'s move");
            System.out.print("Enter row: ");
            int row = scanner.nextInt();
            System.out.println();
            System.out.print("Enter column: ");
            int column = scanner.nextInt();
            if (row > 3 || column > 3 || row < 1 || column < 1) {
                System.out.println("Invalid row / column, (1-3)");
                displayBoard(c);
                continue;
            }
            if (c[row - 1][column - 1] != ' ') {
                System.out.println("Cell is already occupied");
                displayBoard(c);
                continue;
            }
            c[row - 1][column - 1] = player;
            real = false;
        }
    }

    public static void robotMove(char[][] board, char player) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = player;
                    if (win(board, player)) {
                        board[i][j] = player; 
                        return;
                    }
                    board[i][j] = ' ';
                }
            }
        }
        char opponent;
        if (player == 'X') {
            opponent = 'O';
        } else {
            opponent = 'X';
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = opponent;
                    if (win(board, opponent)) {
                        board[i][j] = ' ';
                        board[i][j] = player;
                        return;
                    }
                    board[i][j] = ' ';
                }
            }
        }
        while(true) {
        	int r = (int)(Math.random() * board.length);
        	int c = (int)(Math.random() * board.length);
        	if (board[r][c] == ' ') {
        		board[r][c] = player;
        		return;
        	}
        }
    }

    public static boolean win(char[][] board, char player) {
        for (int i = 0; i < board.length; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) || 
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) || 
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }

    public static void draw(char[][] c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (c[i][j] == ' ') {
                    return;
                }
            }
        }
        System.out.println();
        displayBoard(c);
        System.out.println("Draw");
        System.exit(0);
    }

    public static void deLay(int t) {
        double starTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - starTime < t) {
        }
    }
}
