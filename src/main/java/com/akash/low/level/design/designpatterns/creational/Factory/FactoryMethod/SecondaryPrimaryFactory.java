package com.akash.low.level.design.designpatterns.creational.Factory.FactoryMethod;

import com.akash.low.level.design.designpatterns.creational.Factory.Button;
import com.akash.low.level.design.designpatterns.creational.Factory.SecondaryButton;

public class SecondaryPrimaryFactory implements ButtonFactory {
    @Override
    public Button creatButton() {
        return new SecondaryButton();
    }
}
