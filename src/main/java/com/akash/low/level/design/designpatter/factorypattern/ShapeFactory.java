package com.akash.low.level.design.designpatter.factorypattern;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                return new Circel();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
