package com.guoxj.designPattern.behavioral.Visitor;

/**
 * @author Guoxj
 * @version 1.0
 */
public class ConcreteElementB extends Element {

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operation() {

    }
}
