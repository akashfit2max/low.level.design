package com.akash.low.level.design.case_studies.pen.models;

import com.akash.low.level.design.case_studies.pen.interfaces.RefilPen;
import com.akash.low.level.design.case_studies.pen.strategies.SmoothWritingStrategy;
import com.akash.low.level.design.case_studies.pen.strategies.WritingStrategy;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class GelPen extends Pen implements RefilPen {
    private Refill refill;

    public GelPen(String name, String barnd, Double price, Refill refill) {
        super(name, barnd, price, PenType.GEL, new SmoothWritingStrategy());
        this.refill = refill;
    }

    @Override
    public void changeRefill(Refill refill) {
        if (this.canRefill()) {
            this.refill = refill;
        }
    }

    @Override
    public Refill getRefill() {
        return refill;
    }

    @Override
    public Boolean canRefill() {
        return true;
    }
}
