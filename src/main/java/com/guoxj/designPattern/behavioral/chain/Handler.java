package com.guoxj.designPattern.behavioral.chain;

/**
 * @author Guoxj
 * @version 1.0
 */
public abstract class Handler {

    private Handler successor;

    public abstract void handleRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
