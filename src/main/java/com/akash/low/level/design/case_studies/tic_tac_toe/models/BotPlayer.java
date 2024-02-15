package com.akash.low.level.design.case_studies.tic_tac_toe.models;

import com.akash.low.level.design.case_studies.tic_tac_toe.strategy.PlayingStrategy;
import lombok.Getter;

@Getter
public class BotPlayer extends Player {

    private BotLevel level;
    private PlayingStrategy strategy;

    public BotPlayer(GameSymbol symbol, BotLevel level) {
        super(symbol);
        this.level = level;
    }

    @Override
    public BoardCell play(Board board) {
        System.out.println("Bot is playing");
        return null;
    }
}
