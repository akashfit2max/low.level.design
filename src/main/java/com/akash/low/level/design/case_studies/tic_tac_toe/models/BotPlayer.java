package com.akash.low.level.design.case_studies.tic_tac_toe.models;

import com.akash.low.level.design.case_studies.tic_tac_toe.strategy.PlayingStrategy;
import lombok.Getter;

import java.util.Random;
import java.util.Scanner;

@Getter
public class BotPlayer extends Player {

    private BotLevel level;
    private PlayingStrategy strategy;
    private Random random = new Random();

    public BotPlayer(GameSymbol symbol, BotLevel level) {
        super(symbol);
        this.level = level;
    }

    @Override
    public BoardCell play(Board board) {
        System.out.println("Bot is playing");
        int row = random.nextInt(board.getBoard().size()-1) + 1;
        int col = random.nextInt(board.getBoard().size()-1) + 1;
        return new BoardCell(row, col, this.getSymbol());
    }
}
