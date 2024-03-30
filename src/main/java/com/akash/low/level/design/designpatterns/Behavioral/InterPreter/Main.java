package com.akash.low.level.design.designpatterns.Behavioral.InterPreter;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 10);
        context.put("b", 2);

        AbstractExpression abstractExpression = new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b"));
        int val = abstractExpression.interpreter(context);
        System.out.println(val);
    }
}
