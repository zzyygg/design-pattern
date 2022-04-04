package com.guoxj.designPattern.behavioral.interpreter;

/**
 * @author Guoxj
 * @version 1.0
 */
public abstract class AbstractExpression {
    abstract Object interpreter(Context context);
}
