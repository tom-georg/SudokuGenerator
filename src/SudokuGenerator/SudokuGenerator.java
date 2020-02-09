package SudokuGenerator;

import java.util.Random;


public class SudokuGenerator {
    private SudokuChecker sudokuChecker;
    public SudokuGenerator(){
        sudokuChecker = new SudokuChecker();
    }
    public void generateField(){    //Generiert das Feld, indem es jeweils eine Box zufällig erstellt und dannach überprüft, ob das Feld richtig ist
        int[][] board = new int[9][9];                      //Generates a field full of 9s because 9s and later replaces the 9s with Sudoku numbers
        for(int i = 0 ; i < board.length ; i ++){
            for(int j = 0 ; j < board[i].length ; j ++){
                board[j][i] = 9;
            }
        }

        int[] box = new int[9];    //This array represents a Box, it will be filled with numbers and then added to the board
        boolean[] numbers = new boolean[9];     //This array is set to true at a certain index, if the number is used in the Box
        Random r = new Random();
        int curNum = 0;

        for(int i = 0 ; i < 9 ; i ++){
            do{//This loops generates new numbers randomly until it has a number, that was not used in this box already
                curNum = r.nextInt(9);
            }while(numbers[curNum] == true);
            numbers[curNum] = true;
            box[i] = curNum;
        }

        int[][] box2d = arrayConverter(box); //converts the 9x1 "box" array into a 3x3 "box2d" 2d-array

        printField(box2d);

    }

    private int[][] arrayConverter(int[] box){ //converts a 9x1 array into a 3x3 2d-array
        int[][] box2d = new int[3][3];

        int z = 0;
        for(int y = 0 ; y < 3 ; y ++){
            for(int x = 0 ; x < 3 ; x ++){
                box2d[x][y] = box[z];
                z++;
            }
        }
        return box2d;
    }

    private void printField(int[][] board){
        String output;
        for(int i = 0 ; i < board.length ; i ++){
            output = "";
            for(int j = 0 ; j < board[i].length ; j ++){
                output += " " + board[j][i];
            }
            System.out.println(output);
        }
    }
}
