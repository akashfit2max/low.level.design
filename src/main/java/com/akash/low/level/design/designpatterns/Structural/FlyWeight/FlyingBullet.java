package com.akash.low.level.design.designpatterns.Structural.FlyWeight;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class FlyingBullet {
    private double x;
    private double y;
    private double z;
    private double velocity;
    private double angle;

    private Bullet bullet;
}
