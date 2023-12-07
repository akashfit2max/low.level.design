package com.akash.low.level.design.designpatterns.Behavioral.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Navigator {
    private NavigationStrategy navigationStrategy;

    public void navigate() {
        navigationStrategy.navigate();
    }
}
