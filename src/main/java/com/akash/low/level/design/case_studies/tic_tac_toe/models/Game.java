package com.akash.low.level.design.case_studies.tic_tac_toe.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Game {
    private Board board;
    private List<Player> players = new ArrayList<>();

    public static Game createGame(List<Player> players, int rows, int columns) {
        Board board = new Board(rows, columns);
        Game game = new Game(board, players);
        return game;
    }

    public void makeMove(Player incomingPlayer , Board board) {
        incomingPlayer.play(board);
    }

}
