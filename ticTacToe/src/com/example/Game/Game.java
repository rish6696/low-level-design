package com.example.Game;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    int n;
    int turn;

    int[][] board;

    int[] zeroCountRows;
    int[] zeroCountColumns;

    int[] oneCountRows;
    int[] oneCountColumns;

    int totalInputs;

    public Game(int n) {
        this.n = n;
        this.board = new int[n][n];

        zeroCountRows = new int[n];
        zeroCountColumns = new int[n];

        oneCountRows = new int[n];
        oneCountColumns = new int[n];

        int turn = (int) Math.random() % 2;
        System.out.println(String.format("WelCome to the game , player A will enter %d and B will enter %d", 0, 1));
        System.out.println("FIrst Enter Symbol, THen row, then Column");
        if (turn == 0) {
            System.out.println("Player A Please Enter your Chance");
        } else {
            System.out.println("Player B PLease Enter your Chance");
        }

        for (int[] a : board) {
            Arrays.fill(a, -1);
        }
        startGame();
    }

    private void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private void startGame() {
        Scanner st = new Scanner(System.in);
        boolean gameOver = false;
        while (!gameOver) {
            int input = st.nextInt();
            int row = st.nextInt();
            int col = st.nextInt();
            if (input != 0 && input != 1) {
                System.out.println("Invalid input press either 0 or 1");
                continue;
            }

            if (input != turn) {
                System.out.println("Invalid Input Please enter your symbol");
                continue;
            }

            if (row < 0 || row >= this.n || col < 0 || col >= this.n) {
                System.out.println("Invalid Row and Column, Please try again");
                continue;
            }
            this.totalInputs++;
            this.board[row][col] = input;
            if (input == 0) {
                if (zeroCountRows[row] == n - 1 || zeroCountColumns[col] == n - 1) {
                    board[row][col] = turn;
                    System.out.println("Player A wins");
                    printBoard();
                    break;
                }
            } else {
                if (oneCountRows[row] == n - 1 || oneCountColumns[col] == n - 1) {
                    board[row][col] = turn;
                    System.out.println("Player B wins");
                    printBoard();
                    break;
                }
            }

            if (this.totalInputs == this.n * this.n) {
                board[row][col] = turn;
                System.out.println("Game Drawn, Nobody Wins");
                printBoard();
                break;
            }

            board[row][col] = input;
            if (input == 0) {
                zeroCountRows[row]++;
                zeroCountColumns[col]++;
                System.out.println("Player B Pleas enter your input");
            } else {
                oneCountRows[row]++;
                oneCountColumns[col]++;
                System.out.println("Player A Pleas enter your input");
            }
            printBoard();
            turn = (turn + 1) % 2;

        }

        st.close();

    }

}
