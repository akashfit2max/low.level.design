package com.akash.low.level.design.case_studies.pen.models;

import com.akash.low.level.design.case_studies.pen.strategies.SmoothWritingStrategy;
import com.akash.low.level.design.case_studies.pen.strategies.WritingStrategy;

public class FountainPen extends Pen {
    public FountainPen(String name, String barnd, Double price) {
        super(name, barnd, price, PenType.FOUNTAIN, new SmoothWritingStrategy());
    }
}
