package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {

        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (checkRow(board, i) || checkColumn(board, i)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean checkRow(int[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
                if (board[row][i] != 1) {
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static boolean checkColumn(int[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
