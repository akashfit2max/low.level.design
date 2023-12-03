package com.akash.low.level.design.designpatterns.creational.Factory.FactoryMethod.AbstractFactory;

import com.akash.low.level.design.designpatterns.creational.Factory.Button;
import com.akash.low.level.design.designpatterns.creational.Factory.SecondaryButton;

public class DarkThemeFactory implements ThemeFactory {
    @Override
    public Button creatButton() {
        return new SecondaryButton();
    }

    @Override
    public CheckBox creatCheckBox() {
        return new DarkCheckBox();
    }
}
