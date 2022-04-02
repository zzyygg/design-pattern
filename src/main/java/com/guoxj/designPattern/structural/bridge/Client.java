package com.guoxj.designPattern.structural.bridge;

/**
 * 桥梁模式
 * 定义：将抽象和实现解耦，使得两者可以独立地变化
 *
 * @author Guoxj
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementor();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
}
