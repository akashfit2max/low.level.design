package com.akash.low.level.design.case_studies.pen.interfaces;

import com.akash.low.level.design.case_studies.pen.models.Refill;

public interface RefilPen {
    public void changeRefill(Refill refill);
    public Refill getRefill();
    public Boolean canRefill();
}
