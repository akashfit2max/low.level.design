package com.akash.low.level.design.case_studies.snakeandladder.models;

import lombok.*;

@Getter
@Setter
public class BaseCell extends Cell {
    public BaseCell(CellType cellType, int index) {
        super();
    }

    @Override
    public Integer getNextPosition() {
        return getIndex();
    }
}
