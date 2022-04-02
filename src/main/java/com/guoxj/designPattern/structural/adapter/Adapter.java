package com.guoxj.designPattern.structural.adapter;

/**
 * 适配器模式
 * 定义：将一个接口或类转换成其他的接口或类，如当前适配器将Adaptee转换为Target
 *
 * @author Guoxj
 * @version 1.0
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.specificRequest();
    }
}
