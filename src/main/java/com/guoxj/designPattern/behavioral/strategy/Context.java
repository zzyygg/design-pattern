package com.guoxj.designPattern.behavioral.strategy;

/**
 * 策略模式
 * 定义：定义一组算法，将每个算法都封装起来，并且使它们之间可以转换
 *
 * @author Guoxj
 * @version 1.0
 */
public class Context {

    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextStrategy() {
        strategy.strategy();
    }
}
