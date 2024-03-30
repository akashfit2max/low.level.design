package com.akash.low.level.design.designpatterns.Behavioral.InterPreter;

public class MultiplyNonTerminalExpression implements AbstractExpression {

    AbstractExpression leftExpression;
    AbstractExpression rightExpression;

    public MultiplyNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpreter(Context context) {
        return leftExpression.interpreter(context) * rightExpression.interpreter(context);
    }
}
