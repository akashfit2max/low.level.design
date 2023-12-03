package com.akash.low.level.design.designpatterns.creational.Factory.FactoryMethod.AbstractFactory;

import com.akash.low.level.design.designpatterns.creational.Factory.Button;
import com.akash.low.level.design.designpatterns.creational.Factory.PrimaryButton;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public Button creatButton() {
        return new PrimaryButton();
    }

    @Override
    public CheckBox creatCheckBox() {
        return new LightCheckBox();
    }
}
