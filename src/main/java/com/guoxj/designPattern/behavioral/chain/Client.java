package com.guoxj.designPattern.behavioral.chain;

/**
 * 责任链模式
 * 定义：使多个对象都有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系。将这些对象连城一条链，并沿着这条链处理该请求，直到有对象处理它为止
 *
 * @author Guoxj
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Handler alice = new ConcreteHandler();
        Handler bob = new ConcreteHandler();
        alice.setSuccessor(bob);
        alice.handleRequest();
    }
}
