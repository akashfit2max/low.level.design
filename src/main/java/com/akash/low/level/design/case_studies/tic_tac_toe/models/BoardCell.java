package com.akash.low.level.design.case_studies.tic_tac_toe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class BoardCell {
    private Integer row;
    private Integer col;
    private GameSymbol symbol;

    public BoardCell(Integer row, Integer col, GameSymbol symbol) {
        this.row = row;
        this.col = col;
        this.symbol = GameSymbol.E;
    }
}
