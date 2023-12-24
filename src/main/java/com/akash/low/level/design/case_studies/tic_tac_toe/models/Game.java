package com.akash.low.level.design.case_studies.tic_tac_toe.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Game {
    private Board board;
    private List<Player> players = new ArrayList<>();
}
