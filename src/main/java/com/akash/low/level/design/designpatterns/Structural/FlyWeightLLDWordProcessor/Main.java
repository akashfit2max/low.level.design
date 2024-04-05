package com.akash.low.level.design.designpatterns.Structural.FlyWeightLLDWordProcessor;

public class Main {

    public static void main(String[] args) {
        ILetter l1 = LetterFactory.crateLetter('t');
        ILetter l2 = LetterFactory.crateLetter('t');
        l1.display(0, 0);
        l2.display(0, 6);
        System.out.println(l1.equals(l2));
    }


}
