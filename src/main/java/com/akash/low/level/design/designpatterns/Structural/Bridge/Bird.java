package com.akash.low.level.design.designpatterns.Structural.Bridge;

public class Bird extends LivingThings {
    public Bird(BreathImplementor breathImplementor) {
        super(breathImplementor);
    }

    @Override
    public void breathProcess() {
        breathImplementor.breath();
    }
}
