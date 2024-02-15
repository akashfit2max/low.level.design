package com.akash.low.level.design.case_studies.tic_tac_toe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BoardCell {
    private Integer row;
    private Integer col;

    private GameSymbol symbol;
}
