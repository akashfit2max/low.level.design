package com.akash.low.level.design.case_studies.snakeandladder.dto;

import com.akash.low.level.design.case_studies.snakeandladder.models.Cell;
import com.akash.low.level.design.case_studies.snakeandladder.models.Dice;
import com.akash.low.level.design.case_studies.snakeandladder.models.Player;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class gameRequest {
    private Integer boardSize;
    List<Player> players = new ArrayList<>();
    List<Dice> dices = new ArrayList<>();
    List<Cell> specialCells = new ArrayList<>();
}
