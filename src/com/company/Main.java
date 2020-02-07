package com.company;
import SudokuGenerator.SudokuChecker;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        //Erstellt ein 2D array, voller Zahlen
        int[][] board = new int[9][9];
        for(int i = 0 ; i < board.length ; i ++){
            for(int j = 0 ; j < board[i].length ; j ++){
                board[i][j] = i+1;
            }
        }
        //In der 3. Spalte werden die Zahlen verändert, sodass nur unterschiedliche Zahlen in der Spalte sind
        for(int i = 0 ; i < board[2].length ; i ++){
            board[2][i] = i+1;
        }


        SudokuChecker sChecker = new SudokuChecker();
        System.out.println(sChecker.checkBox(board, 2, 2));


        //Fenster f = new Fenster("TEST");



       /* Random r = new Random();
        int a = r.nextInt(4);
        int uno = r.nextInt(1001);
        int dos = r.nextInt(1001);
        if(a == 0) {int zero = uno + dos;}
        if(a == 1) {int one = uno - dos;}
        if(a == 2) {int two = uno * dos;}
        if(a == 2) {
            if(uno > dos){
                int three = uno / dos;
            }
            else{
                int three = dos / uno;
            }*/
        }
        //test 24.01.2020
        // Everyone is free to add some sysouts or comments here.
        // We will introduce discipline later.
      // Test 2 :D
        // Test 3 Laurin
      // UPDATE: 27.01.2020 15:30 Uhr -

    }