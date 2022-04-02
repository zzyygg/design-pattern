package com.guoxj.designPattern.behavioral.chain;

/**
 * @author Guoxj
 * @version 1.0
 */
public class ConcreteHandler extends Handler {

    @Override
    public void handleRequest() {
        if (getSuccessor() != null) {
            getSuccessor().handleRequest();
        } else {
            //...
        }
    }
}
