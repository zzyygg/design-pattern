package com.guoxj.designPattern.behavioral.Visitor;

/**
 * 访问者模式
 * 定义：封装一些作用于某种数据结构中各个元素的操作，它可以在不改变数据结构的前提下定义作用域这些元素的新的操作
 *
 * @author Guoxj
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.createElements();
        Visitor visitor = new ConcreteVisitor();
        objectStructure.action(visitor);
    }
}
