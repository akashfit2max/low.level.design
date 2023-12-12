package com.akash.low.level.design.case_studies.pen.models;

import com.akash.low.level.design.case_studies.pen.interfaces.RefilPen;
import com.akash.low.level.design.case_studies.pen.strategies.SmoothWritingStrategy;
import com.akash.low.level.design.case_studies.pen.strategies.WritingStrategy;

public class GelPen extends Pen implements RefilPen {
    public GelPen(String name, String barnd, Double price) {
        super(name, barnd, price, PenType.GEL, new SmoothWritingStrategy());
    }

    @Override
    public void refill() {
        System.out.printf("refilling pen");
    }

    @Override
    public Refill getRefill() {
        return new Refill();
    }

    @Override
    public Boolean canRefill() {
        return true;
    }
}
