package com.guoxj.designPattern.creation.builder;

/**
 * 抽象建造者
 *
 * @author Guoxj
 * @version 1.0
 */
public abstract class Builder {
    abstract void setPart1(Product product);
    abstract void setPart2(Product product);
    abstract void setPart3(Product product);
}
