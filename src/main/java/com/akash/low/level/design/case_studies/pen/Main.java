package com.akash.low.level.design.case_studies.pen;

import com.akash.low.level.design.case_studies.pen.models.*;
import com.akash.low.level.design.case_studies.pen.strategies.SmoothWritingStrategy;

public class Main {
    public static void main(String[] args) {
        Pen pen = GelPen.builder()
                .barnd("cello")
                .name("Gel pen")
                .price(10.0)
                .writingStrategy(new SmoothWritingStrategy())
                .refill(Refill.builder().
                        refilType(RefilType.GEL)
                        .ink(new Ink("red", "parker"))
                        .nib(new Nib(10.0, NibType.GOLD)).build()).build();

        pen.write();
    }
}
