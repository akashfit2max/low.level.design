package com.akash.low.level.design.designpatterns.Structural.Bridge;

public abstract class LivingThings {
    BreathImplementor breathImplementor;

    public LivingThings(BreathImplementor breathImplementor) {
        this.breathImplementor = breathImplementor;
    }

    public abstract void breathProcess();
}
