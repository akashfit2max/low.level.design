package com.akash.low.level.design.case_studies.pen.models;

import com.akash.low.level.design.case_studies.pen.strategies.WritingStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pen {
    private String name;
    private String barnd;
    private Double price;
    private PenType type;
    private WritingStrategy writingStrategy;

    public void write() {
        writingStrategy.write();
    }

}
