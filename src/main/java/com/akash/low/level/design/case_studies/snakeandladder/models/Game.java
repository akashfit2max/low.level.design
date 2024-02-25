package com.akash.low.level.design.case_studies.snakeandladder.models;

import com.akash.low.level.design.case_studies.snakeandladder.dto.gameRequest;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private Integer gameId;
    private Board board;
    private List<Player> players = new ArrayList<>();
    private List<Dice> dices = new ArrayList<>();

    public Game createGame(gameRequest gameReq) {
        board = new Board(gameReq.getBoardSize(), gameReq.getSpecialCells());
        players = gameReq.getPlayers();
        dices = gameReq.getDices();
        return new Game(1, board, players, dices);
    }

    public int roll() {
        int rollValue = 0;
        for (Dice dice : dices) {
            rollValue += dice.roll();
        }
        return rollValue;
    }

    public void makeMove(Player player, Piece piece) {
        int rollValue = roll();
        Cell currentCell = this.board.getCurrentCell(player);
        Cell nextCell = this.board.getNextCell(currentCell, rollValue);
        currentCell.removePiece(player.getPieces().get(0));
        nextCell.addPiece(player.getPieces().get(0));

    }

}
