package com.akash.low.level.design.designpatterns.creational.Factory;

public class ButtonFactory {

    public static Button creatInstance(ButtonType type) {
        switch (type) {
            case PRIMARY -> {
                return new PrimaryButton();
            }
            case SECONDARY -> {
                return new SecondaryButton();
            }
        }
        throw new RuntimeException("Invalid type" + type);
    }
}
