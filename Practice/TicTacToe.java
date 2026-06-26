 import java.util.Scanner;

public class TicTacToe {

    private char[][] board = new char[3][3];
    private char currentPlayer = 'X';
    private boolean gameOver = false;

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public void play() {
        initBoard();
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter row (0-2) and column (0-2): ");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (!isValidMove(row, col)) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            board[row][col] = currentPlayer;

            if (hasWon(currentPlayer)) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameOver = true;
            } else if (isDraw()) {
                printBoard();
                System.out.println("It's a draw!");
                gameOver = true;
            } else {
                switchPlayer();
            }
        }

        scanner.close();
    }

    private void initBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }
    }

    private void printBoard() {
        System.out.println();
        for (int row = 0; row < 3; row++) {
            System.out.print(" ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col]);
                if (col < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (row < 2) {
                System.out.println("-----------");
            }
        }
        System.out.println();
    }

    private boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        return board[row][col] == ' ';
    }

    private boolean hasWon(char player) {
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player &&
                board[row][1] == player &&
                board[row][2] == player) {
                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player &&
                board[1][col] == player &&
                board[2][col] == player) {
                return true;
            }
        }

        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) {
            return true;
        }

        return false;
    }

    private boolean isDraw() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}