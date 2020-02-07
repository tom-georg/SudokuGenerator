package SudokuGenerator;

import static java.lang.Math.ceil;

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
        //Checkt alle Zahlen entlang der x-Achse
        boolean[] checklist = new boolean[board.length];    //Eine Array die immer an der Position einer bestimmten Zahl auf true gesetzt wird
        for(int i = 0 ; i < board.length ; i ++){
            if(checklist[board[i][y]-1] == true){
                return false;
            }else{
                checklist[board[i][y]-1] = true;
            }
        }
        //Checkt alle Zahlen entlang der y-Achse
        checklist = new boolean[board[x].length];
        for(int i = 0 ; i < board[x].length ; i ++){
            if(checklist[board[x][i]-1] == true){
                return false;
            }else{
                checklist[board[i][y]-1] = true;
            }
        }
        return true;
    }

    public boolean checkBox(int[][] board, int x, int y) {
        int[] box = getBox(x, y);
        x = box[0];
        y = box[1];
        boolean[] checklist = new boolean[board.length];    //Eine Array die immer an der Position einer bestimmten Zahl auf true gesetzt wird
        for(int i = y ; i < y+3 ; i ++){
            for(int j = x ; j < x+3 ; j ++){
                if(checklist[board[i][j]-1] == true){
                    return false;
                }else{
                    checklist[board[i][j]-1] = true;
                }
            }
        }
        return true;
    }

    private int[] getBox(int x, int y){ // Gibt die Koordinaten zurück an denen die Box anfängt
        int[] coords = new int[2];
        coords[0] = (x/3)*3;
        coords[1] = (y/3)*3;
        return coords;
    }
}
