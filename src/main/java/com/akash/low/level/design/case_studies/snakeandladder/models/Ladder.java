package com.akash.low.level.design.case_studies.snakeandladder.models;

public class Ladder extends Cell {
    private Integer endIndex;

    @Override
    public Integer getNextPosition() {
        return endIndex;
    }
}
