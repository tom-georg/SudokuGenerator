package com.company;
import SudokuGenerator.SudokuChecker;
import SudokuGenerator.SudokuGenerator;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        SudokuGenerator sGen = new SudokuGenerator();
        int[][] board = sGen.generateField();
        sGen.printField(board);
    }
}