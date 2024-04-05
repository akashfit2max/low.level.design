package com.akash.low.level.design.designpatterns.Structural.FlyWeightLLDWordProcessor;

public class DocumentCharater implements ILetter {
    private char character;
    private String fontType;
    private int size;

    DocumentCharater(char character, String fontType, int size) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;

    }

    @Override
    public void display(int row, int col) {
        String op = String.format("%s at pos %s,%s", this.character, row, col);
        System.out.println(op);
    }
}
