package com.guoxj.designPattern.behavioral.Visitor;

/**
 * @author Guoxj
 * @version 1.0
 */
public interface Visitor {
    void visit(ConcreteElementA e);
    void visit(ConcreteElementB e);
}
