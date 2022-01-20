package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return winLine(board) || winRow(board);
    }

    public static boolean winLine(int[][] board) {
        boolean result = false;
        int sum;
        for (int i = 0; i < board.length; i++) {
            sum = 0;
            for (int j = 0; j < board[0].length; j++) {
                sum += board[i][j];
                if (sum == board[0].length) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean winRow(int[][] board) {
        boolean result = false;
        int sum;
        for (int i = 0; i < board.length; i++) {
            sum = 0;
            for (int j = 0; j < board[0].length; j++) {
                sum += board[j][i];
                if (sum == board.length) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
