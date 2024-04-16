package com.akash.low.level.design.case_studies.TicTacToeLLD;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        System.out.println("game winner is: " + game.startGame());
    }
}
