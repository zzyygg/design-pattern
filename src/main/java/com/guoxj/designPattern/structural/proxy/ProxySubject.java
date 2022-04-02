package com.guoxj.designPattern.structural.proxy;

/**
 * 代理模式
 * 定义：为其他对象提供一种代理1以控制对这个对象的访问
 * 种类：远程代理、虚拟代理、保护代理、缓存代理...
 *
 * @author Guoxj
 * @version 1.0
 */
public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        subject.request();
    }
}
