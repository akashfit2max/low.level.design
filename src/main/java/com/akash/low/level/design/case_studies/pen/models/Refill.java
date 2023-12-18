package com.akash.low.level.design.case_studies.pen.models;

import lombok.Builder;

@Builder
public class Refill {
    private Ink ink;
    private Nib nib;
    private RefilType refilType;
}
