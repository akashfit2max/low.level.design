package com.akash.low.level.design.case_studies.tic_tac_toe.models;

import lombok.Getter;

import java.util.Scanner;

@Getter
public class HumanPlayer extends Player {

    private User user;

    public HumanPlayer(User user, GameSymbol symbol) {
        super(symbol);
        this.user = user;
    }

    @Override
    public BoardCell play(Board board) {
        System.out.println("Human is playing...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter row and col to perform next move");
        int row = sc.nextInt();
        int col = sc.nextInt();
        return new BoardCell(row, col, this.getSymbol());
    }
}
