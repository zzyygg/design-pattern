package com.guoxj.designPattern.structural.flyweight;

/**
 * @author Guoxj
 * @version 1.0
 */
public class ConcreteFlyweight implements Flyweight {

    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {

    }
}
