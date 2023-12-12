package com.akash.low.level.design.case_studies.pen.strategies;

public class SmoothWritingStrategy implements WritingStrategy {
    @Override
    public void write() {
        System.out.printf("writing smoothly");
    }
}
