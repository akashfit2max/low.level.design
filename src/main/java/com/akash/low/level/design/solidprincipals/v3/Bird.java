package com.akash.low.level.design.solidprincipals.v3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Bird {
    private int weight;
    private int height;
    private int size;
}