package com.akash.low.level.design.designpatterns.creational.Factory.FactoryMethod.AbstractFactory;

import com.akash.low.level.design.designpatterns.creational.Factory.Button;

public class Runner {
    public static void main(String[] args) {
        ThemeFactory darkTheme = new DarkThemeFactory();
        Button button = darkTheme.creatButton();
        CheckBox checkBox = darkTheme.creatCheckBox();

        button.render();
        checkBox.render();
    }
}
