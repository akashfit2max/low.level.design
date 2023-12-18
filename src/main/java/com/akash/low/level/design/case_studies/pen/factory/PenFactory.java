package com.akash.low.level.design.case_studies.pen.factory;

import com.akash.low.level.design.case_studies.pen.models.GelPen;
import com.akash.low.level.design.case_studies.pen.models.PenType;

public class PenFactory {
    public static GelPen.GelPenBuilder createGelPen() {
        return GelPen.builder();
    }
}
