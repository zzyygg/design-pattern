package com.guoxj.designPattern.creation.singleton;

/**
 * 单例模式
 * 定义：确保一个类只有一个实例，而且自行实例化并向整个系统提供此实例
 * 应用：Spring框架的所有Bean默认单例、
 *      java.lang.Runtime通过其getRuntime()方法返回唯一实例
 *
 * @author Guoxj
 * @version 1.0
 */
public class Singleton {

    private static final Singleton HUNGRY_INSTANCE = new Singleton();

    private static Singleton lazy_instance;

    /**
     * 构造器私有
     */
    private Singleton () {
    }

    /**
     * 饿汉式
     *
     * @return Singleton
     */
    public static Singleton getHungryInstance() {
        return HUNGRY_INSTANCE;
    }

    /**
     * 线程安全的懒汉式模式
     *
     * @return Singleton
     */
    public static Singleton getLazyInstance() {
        if (lazy_instance == null) {
            synchronized (Singleton.class) {
                if (lazy_instance == null) {
                    lazy_instance = new Singleton();
                }
            }
        }
        return lazy_instance;
    }

}

