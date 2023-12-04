package com.akash.low.level.design.designpatterns.Structural.FlyWeight;

// step 1 - create flyweight
// it should be immutable

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Bullet {
    private BulletType type;
    private Byte[] image;
    private String color;
    private double weight;
}
