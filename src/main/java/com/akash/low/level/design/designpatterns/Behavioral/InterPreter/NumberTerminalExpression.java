package com.akash.low.level.design.designpatterns.Behavioral.InterPreter;

public class NumberTerminalExpression implements AbstractExpression{

    String stringValue;

    NumberTerminalExpression(String val) {
        this.stringValue = val;
    }
    @Override
    public int interpreter(Context context) {
        return context.get(stringValue);
    }
}
