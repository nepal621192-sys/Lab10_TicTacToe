import java.util.Scanner;

public class TicTacToe {
    private static String[][] board = new String[3][3];

    static void main(String[] args) {
        //Vars
        Scanner scan = new Scanner(System.in);
        String p1 = "X";
        String p2 = "O";
        int p1R;
        int p1C;
        int p2R;
        int p2C;
        boolean contGame = false;

        //Game
        do {

            //This do-while loop keeps running while the game is still going
            //Stops once a winner or tie occurs
            do {

                //Player 1 - loops until valid move made
                do {

                } while ();


                //Player 2 - loops until valid move made
                do {

                } while ();

            } while ();

        } while (!contGame);

    }

    private static void clearBoard() {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                board[r][c] = " - ";
            }
        }
    }

    private static void displayBoard() {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                System.out.println(board[r][c]);
            }
        }
    }

    private static boolean isValidMove(int row, int col) {

    }

    private static boolean isWin(String player) {

    }

    private static boolean isColWin(String player) {

    }

    private static boolean isRowWin(String player) {

    }

    private static boolean isDiagonalWin(String player) {

    }

    private static boolean isTie(String player1, String player2) {

    }
}