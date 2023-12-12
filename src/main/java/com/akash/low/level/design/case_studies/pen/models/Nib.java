package com.akash.low.level.design.case_studies.pen.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Nib {
    private Double radius;
    private NibType nibType;
}
