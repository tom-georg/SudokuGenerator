package SudokuGenerator;

public class SudokuChecker {


    /**
     * The method checklines
     * *
     * @param board (the sudoku board)
     * @param x position
     * @param y position
     * @return
     *     true:  The vertical and horizontal lines of the board
     *            are valid: No duplicates
     *     false: There are duplicates in the vertical and
     *            horizonal lines
     *
     *   Example:
     *   board:          x:1 y:0
     *        213
     *        121
     *        322
     *   returns false because 213 (horizonal) is valid, 122 (vertical) is not.
     *
     */
    public boolean checkLines(int[][] board, int x, int y) {
        //Ich hole zuerst eine Kopie der ersten Zeile,
        // dann hake ich in einer boolean Array die Ziffern ab,
        // welche in der ersten Zeile vorkommen.
        //Sollte schon eine Ziffer abgehakt sein, returne ich false.
        boolean[] checklist = new boolean[board.length];

        for (int i = 0; i < board.length; i++) {
            int[] checkoffhorizontal = board[i];
            for (int j = 0; j < checkoffhorizontal.length; j++) {
                if( checklist[checkoffhorizontal[j]] = true){
                    return false;
                }
                checklist[checkoffhorizontal[j]] = true;
            }
        }

        return false;
    }
}
