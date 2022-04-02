package com.guoxj.designPattern.structural.bridge;

/**
 * @author Guoxj
 * @version 1.0
 */
abstract class Abstraction {

    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operationImp();
    }
}
