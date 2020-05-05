package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
               int i = row;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 'x') {
                    result = false;
                    break;
                }
            }
        return result;
        }

    public static void main(String[] args) {
        char[][] board = new char[4][2];
        board[0][0] = ' ';
        board[0][1] = ' ';
        board[1][0] = 'x';
        board[1][1] = 'x';
        board[2][0] = ' ';
        board[2][1] = ' ';
        board[3][0] = ' ';
        board[3][1] = ' ';


        boolean result = MatrixCheck.monoHorizontal(board, 1);
        System.out.println(result);
    }
}
