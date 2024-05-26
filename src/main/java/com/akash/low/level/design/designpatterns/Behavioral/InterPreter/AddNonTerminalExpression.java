package com.akash.low.level.design.designpatterns.Behavioral.InterPreter;

public class AddNonTerminalExpression implements AbstractExpression {

    AbstractExpression left;
    AbstractExpression right;

    public AddNonTerminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Context context) {
        return left.interpreter(context) + right.interpreter(context);
    }
}
