package com.akash.low.level.design.case_studies.TicTacToeLLD;

import com.akash.low.level.design.case_studies.TicTacToeLLD.Models.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board board;

    public TicTacToeGame() {
        initializeGame();
    }

    public void initializeGame() {
        //creaating 2 players
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player p1 = new Player("Player1", crossPiece);

        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player p2 = new Player("Player2", noughtsPiece);

        players.add(p1);
        players.add(p2);

        board = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            Player playerTurn = players.removeFirst();

            board.printBoard();
            List<Pair<Integer, Integer>> freeSpaces = board.getFreeCells();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            System.out.println("Player: " + playerTurn.name + "Enter x,y : ");
            Scanner scanner = new Scanner(System.in);
            Integer x = scanner.nextInt();
            Integer y = scanner.nextInt();

            boolean pieceAddedSuccessfully = board.addPiece(x, y, playerTurn.playingPiece);
            if (!pieceAddedSuccessfully) {
                String place = String.format("Incorrect position %s and %s", x, y);
                System.out.println(place + "chosen, try again ");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(x, y, playerTurn.playingPiece.pieceType);
            if (winner) {
                return playerTurn.name;
            }

        }
        return "tie";
    }

    private boolean isThereWinner(Integer x, Integer y, PieceType pieceType) {
        boolean xMatch = true;
        boolean yMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in x
        for (int i = 0; i < board.size; i++) {

            if (board.board[x][i] == null || board.board[x][i].pieceType != pieceType) {
                xMatch = false;
            }
        }

        //need to check in y
        for (int i = 0; i < board.size; i++) {

            if (board.board[i][y] == null || board.board[i][y].pieceType != pieceType) {
                yMatch = false;
            }
        }

        //need to check diagonals
        for (int i = 0, j = 0; i < board.size; i++, j++) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for (int i = 0, j = board.size - 1; i < board.size; i++, j--) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return xMatch || yMatch || diagonalMatch || antiDiagonalMatch;
    }

}
