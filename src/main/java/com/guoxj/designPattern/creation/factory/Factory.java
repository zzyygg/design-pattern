package com.guoxj.designPattern.creation.factory;

/**
 * 抽象工厂
 * 定义：定义一个用于创建对象的接口，让子类决定实例化哪个类
 *
 * @author Guoxj
 * @version 1.0
 */
public interface Factory {
    <T extends Product> T createProduct(Class<T> c);
}
