package com.guoxj.designPattern.behavioral.template;

/**
 * @author Guoxj
 * @version 1.0
 */
public abstract class AbstractClass {

    protected abstract void operation();

    public void templateMethod() {
        operation();
    }
}
