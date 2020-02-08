package SudokuGenerator;

import java.util.Random;


public class SudokuGenerator {
    private SudokuChecker sudokuChecker;
    private Random r = new Random();

    public SudokuGenerator(){
        sudokuChecker = new SudokuChecker();
    }


    public int[][] generateField(){    //Generiert das Feld, indem es jeweils eine Box zufällig erstellt und dannach überprüft, ob das Feld richtig ist
        int[][] board = new int[9][9];                      //Generates a field full of 9s because 9s and later replaces the 9s with Sudoku numbers
        for(int i = 0 ; i < board.length ; i ++){
            for(int j = 0 ; j < board[i].length ; j ++){
                board[j][i] = 9;
            }
        }

        int[] line = new int[9];
        for(int y = 0 ; y < 9 ; y ++){
            line = generateLine();  //  Ggenerates a line and fills it with all numbers from 0-8
            addLineToBoard(board, line, y); //Adds th line to the board
            board = fixLine(board, y);  //Fixes the line by randomly swapping all numbers in the current line until it works
        }
        board = addOneToAll(board);

       return board;
    }

    private int[][] addOneToAll(int[][] board){
        for(int y = 0 ; y < board[0].length ; y ++){
            for(int x = 0 ; x < board.length ; x ++){
                board[x][y]++;
            }
        }
        return board;
    }

    private int[][] fixLine(int[][] board, int y){
        int num1;
        while(sudokuChecker.checkWholeLine(board, y) == false){
            for(int x = 0 ; x < board.length ; x ++){
                if(sudokuChecker.checkLines(board, x, y) == false){ //If a number is wrong, it is swapped with the one to it's rights
                    board = moveNumUntilRight(board, x, y);
                }
            }
        }
        return board;
    }
    private int[][] moveNumUntilRight(int[][] board, int x, int y){  //Swaps number 1 with random numbers until number 1 is on a right position because it's very easy like that
        int num1;
        int ranX;
        for(int i = 0 ; i < 9 ; i ++){
            ranX = r.nextInt(9);
            num1 = board[x][y];
            board[x][y] = board[ranX][y];
            board[ranX][y] = num1;
            if(sudokuChecker.checkLines(board, ranX, y) == true) {
                return board;
            }
        }
        return board;
    }


    private int[][] addLineToBoard(int[][] board, int[] line, int y){
        for(int x = 0 ; x < line.length ; x ++){
            board[x][y] = line[x];
        }
        return board;
    }

    private int[] generateLine(){   //generates one line with correct one number each from 0-8
        int[] line = new int[9];    //This array represents one line, it will be filled with numbers
        boolean[] numbers = new boolean[9];     //This array is set to true at a certain index, if the number is used in the line
        int curNum = 0;
        for(int i = 0 ; i < 9 ; i ++){
            do{//This loops generates new numbers randomly until it has a number, that was not used in this box already
                curNum = r.nextInt(9);
            }while(numbers[curNum] == true);
            numbers[curNum] = true;
            line[i] = curNum;
        }
        return line;
    }

    public void printField(int[][] board){
        String output;
        for(int i = 0 ; i < board.length ; i ++){
            output = "";
            for(int j = 0 ; j < board[i].length ; j ++){
                output += "  " + board[j][i];
            }
            System.out.println(output);
        }
    }
}
