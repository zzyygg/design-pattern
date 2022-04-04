package com.guoxj.designPattern.behavioral.observer;

/**
 * 观察者模式（又称发布订阅模式）
 * 定义：定义对象一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新
 *
 * @author Guoxj
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new Observer() {
            @Override
            public void update() {
            }
        });
        subject.attach(new Observer() {
            @Override
            public void update() {
            }
        });
        subject.change();
    }
}
