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


    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        int j = column;
        for (int i = 0; i < board.length; i++) {
            if (board[i][j] != 'x') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] board = new char[2][4];
        board[0][0] = ' ';
        board[0][1] = 'x';
        board[0][2] = ' ';
        board[0][3] = ' ';
        board[1][0] = 'x';
        board[1][1] = 'x';
        board[1][2] = 'x';
        board[1][3] = 'x';


        boolean result1 = MatrixCheck.monoHorizontal(board, 1);
        System.out.println(result1);

        boolean result2 = MatrixCheck.monoVertical(board, 1);
        System.out.println(result2);
    }
}
