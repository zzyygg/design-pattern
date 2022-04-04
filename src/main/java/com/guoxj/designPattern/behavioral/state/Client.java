package com.guoxj.designPattern.behavioral.state;

/**
 * 状态模式
 * 定义：当一个对象内在状态改变时允许改变行为，这个度睇下看起来像改变了其类型
 *
 * @author Guoxj
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.handle1();
        context.handle2();
    }
}
