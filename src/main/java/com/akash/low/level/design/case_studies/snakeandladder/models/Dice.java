package com.akash.low.level.design.case_studies.snakeandladder.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dice {
    public Integer faces;

    public int roll() {
        return (int) ((Math.random() * faces) + 1);
    }
}
