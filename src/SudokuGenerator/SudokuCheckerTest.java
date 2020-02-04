package SudokuGenerator;

import org.junit.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class SudokuCheckerTest {

    @Test
    public void checkLines_test01(){

        SudokuChecker sudokuChecker = new SudokuChecker();
        int[][] board = new int[3][3];
        board[0][0] = 1;
        board[1][0] = 2;
        board[2][0] = 2;
        assertEquals(false,
                sudokuChecker.checkLines(board,0,0));
    }

    @Test
    public void checkLines_test02(){
        SudokuChecker sudokuChecker = new SudokuChecker();
        int[][] board = new int[3][3];
        board[0][0] = 1;
        board[1][0] = 2;       //   123
        board[2][0] = 3;       //   001
        board[2][1] = 1;       //   002
        board[2][2] = 2;

        assertEquals(false,sudokuChecker.checkLines(board,2,0));
    }

}