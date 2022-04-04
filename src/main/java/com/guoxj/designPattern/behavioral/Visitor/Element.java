package com.guoxj.designPattern.behavioral.Visitor;

/**
 * @author Guoxj
 * @version 1.0
 */
public abstract class Element {
    abstract void accept(Visitor visitor);
}
