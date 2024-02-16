package com.akash.low.level.design.case_studies.tic_tac_toe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Board {
    List<List<BoardCell>> board = new ArrayList<>();

    public Board(int rows, int columns) {
        this.board = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            List<BoardCell> cuList = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                cuList.add(new BoardCell(i, j, GameSymbol.E));
            }
            this.board.add(cuList);
        }
    }


    public void displayBoard() {
        System.out.println(board.size());
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.size(); j++) {
                if (board.get(i).get(j).getSymbol().equals(GameSymbol.E)) {
                    System.out.print("|   |");
                } else {
                    System.out.print("| " + board.get(i).get(j).getSymbol() + " |");
                }
            }
            System.out.println("\n");
        }
    }
}
