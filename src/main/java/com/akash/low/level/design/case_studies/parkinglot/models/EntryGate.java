package com.akash.low.level.design.case_studies.parkinglot.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class EntryGate extends Gate {
    private DisplayBoard displayBoard;
}
