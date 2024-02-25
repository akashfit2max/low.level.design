package com.akash.low.level.design.case_studies.snakeandladder.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Cell {
    private Integer index;
    private CellType cellType;
    private List<Piece> pieces = new ArrayList<>();

    public abstract Integer getNextPosition();

    public void removePiece(Piece piece) {
    }

    public void addPiece(Piece piece) {
    }
}
