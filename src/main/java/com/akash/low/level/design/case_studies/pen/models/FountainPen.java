package com.akash.low.level.design.case_studies.pen.models;

import com.akash.low.level.design.case_studies.pen.strategies.SmoothWritingStrategy;
import com.akash.low.level.design.case_studies.pen.strategies.WritingStrategy;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class FountainPen extends Pen {
    private Ink ink;
    private Nib nib;

    public FountainPen(String name, String barnd, Double price, Ink ink, Nib nib) {
        super(name, barnd, price, PenType.FOUNTAIN, new SmoothWritingStrategy());
        this.ink = ink;
        this.nib = nib;
    }

    public void changeInk(Ink ink) {
        this.ink = ink;
    }
}
