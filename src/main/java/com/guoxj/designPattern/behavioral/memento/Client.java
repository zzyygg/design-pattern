package com.guoxj.designPattern.behavioral.memento;

/**
 * 备忘录模式
 * 定义：将对象进行备份，提供一种程序数据的备份方法
 *
 * @author Guoxj
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.restoreMemento(caretaker.getMemento());
    }
}
