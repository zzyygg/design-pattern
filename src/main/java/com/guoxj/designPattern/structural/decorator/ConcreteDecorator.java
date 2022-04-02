package com.guoxj.designPattern.structural.decorator;

/**
 * 装饰模式
 * 定义：动态地给一个对象添加一些额外的职责
 *
 * @author Guoxj
 * @version 1.0
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    private void fun() {
        //...
    }

    @Override
    public void operation() {
        fun();
        super.operation();
    }
}
