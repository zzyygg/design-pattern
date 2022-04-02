package com.guoxj.designPattern.structural.decorator;

/**
 * @author Guoxj
 * @version 1.0
 */
public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
