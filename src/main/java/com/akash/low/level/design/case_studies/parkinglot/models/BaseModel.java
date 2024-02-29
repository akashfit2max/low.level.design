package com.akash.low.level.design.case_studies.parkinglot.models;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
public class BaseModel {
    private long id;
    private Date createdAt;
    private Date updatedAt;
}
