package com.akash.low.level.design.designpatterns.creational.Factory.FactoryMethod.AbstractFactory;

import com.akash.low.level.design.designpatterns.creational.Factory.Button;

public interface ThemeFactory {
    public Button creatButton();

    public CheckBox creatCheckBox();
}
