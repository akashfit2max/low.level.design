package com.akash.low.level.design.case_studies.pen.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@AllArgsConstructor
public class Nib {
    private Double radius;
    private NibType nibType;
}
