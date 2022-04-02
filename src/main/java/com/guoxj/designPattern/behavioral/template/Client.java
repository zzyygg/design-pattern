package com.guoxj.designPattern.behavioral.template;

/**
 * 模板方法
 * 定义：定义一个操作中的算法框架，将这些步骤延迟到子类中（如当前举例抽象类中非抽象方法调用调用抽象方法）
 *
 * @author Guoxj
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.operation();
    }
}
