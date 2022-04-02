package com.guoxj.designPattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 享元模式
 * 定义：使用共享对象可有效地支持大量细粒度的对象
 *
 * @author Guoxj
 * @version 1.0
 */
public class FlyweightFactory {

    private static Map<String, Flyweight> pool = new HashMap<>();

    private FlyweightFactory() {
    }

    public static Flyweight getFlyweight(String intrinsicState) {
        Flyweight flyweight = pool.get(intrinsicState);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return flyweight;
    }
}
