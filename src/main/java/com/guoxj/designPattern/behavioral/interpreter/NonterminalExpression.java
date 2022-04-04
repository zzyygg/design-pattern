package com.guoxj.designPattern.behavioral.interpreter;

/**
 * @author Guoxj
 * @version 1.0
 */
public class NonterminalExpression extends AbstractExpression {

    public NonterminalExpression(AbstractExpression expression) {
    }

    @Override
    Object interpreter(Context context) {
        return null;
    }
}
