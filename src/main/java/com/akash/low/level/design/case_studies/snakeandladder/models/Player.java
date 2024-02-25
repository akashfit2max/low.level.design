package com.akash.low.level.design.case_studies.snakeandladder.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Player {
    private User user;
    private List<Piece> pieces = new ArrayList<>();
}
