package com.akash.low.level.design.case_studies.tic_tac_toe.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Game {
    private Board board;
    private List<Player> players = new ArrayList<>();

    public static Game createGame(List<Player> players, int rows, int columns) {
        Board board = new Board(rows, columns);
        Game game = new Game(board, players);
        return game;
    }

    public void makeMove(Player incomingPlayer, Board board) {
        BoardCell cell = incomingPlayer.play(board);
        int row = cell.getRow();
        int col = cell.getCol();
        System.out.println("Move to row: " + row + " col: " + col);
        this.board.getBoard().get(row).get(col).setSymbol(incomingPlayer.getSymbol());
    }

    public void displayBoard() {
        this.board.displayBoard();
    }

}
