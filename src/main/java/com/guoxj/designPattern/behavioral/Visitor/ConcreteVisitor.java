package com.guoxj.designPattern.behavioral.Visitor;

/**
 * @author Guoxj
 * @version 1.0
 */
public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(ConcreteElementA e) {
        e.operation();
    }

    @Override
    public void visit(ConcreteElementB e) {
        e.operation();
    }
}
