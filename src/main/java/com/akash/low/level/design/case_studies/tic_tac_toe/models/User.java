package com.akash.low.level.design.case_studies.tic_tac_toe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
    private String name;
    private String emial;
    private Byte[] photo;
}
