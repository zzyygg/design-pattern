package com.guoxj.designPattern.creation.factory;

import java.lang.reflect.InvocationTargetException;

/**
 * 具体工厂
 *
 * @author Guoxj
 * @version 1.0
 */
public class ConcreteFactory implements Factory {

    @Override
    public <T extends Product> T createProduct(Class<T> tClass) {
        T product = null;
        try {
            product = tClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return product;
    }

}
