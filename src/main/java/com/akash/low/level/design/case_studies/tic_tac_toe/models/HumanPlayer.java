package com.akash.low.level.design.case_studies.tic_tac_toe.models;

import lombok.Getter;

@Getter
public class HumanPlayer extends Player{

    private User user;

    public HumanPlayer(User user, GameSymbol symbol) {
        super(symbol);
        this.user = user;
    }

    @Override
    public BoardCell play(Board board) {
        System.out.println("Human is playing");
        return null;
    }
}
