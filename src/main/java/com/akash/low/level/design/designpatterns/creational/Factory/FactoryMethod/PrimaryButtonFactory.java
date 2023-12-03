package com.akash.low.level.design.designpatterns.creational.Factory.FactoryMethod;

import com.akash.low.level.design.designpatterns.creational.Factory.Button;
import com.akash.low.level.design.designpatterns.creational.Factory.PrimaryButton;

public class PrimaryButtonFactory implements ButtonFactory {
    @Override
    public Button creatButton() {
        return new PrimaryButton();
    }
}
