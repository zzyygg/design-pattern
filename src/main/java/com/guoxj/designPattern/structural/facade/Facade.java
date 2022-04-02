package com.guoxj.designPattern.structural.facade;

/**
 * 外观模式
 * 定义：要求一个子系统的外部与其内部的通信必须从通过一个统一的对象进行
 *
 * @author Guoxj
 * @version 1.0
 */
public class Facade {

    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();

    public void methodA() {
        classA.methodA();
    }

    public void methodB() {
        classB.methodB();
    }

    public void methodC() {
        classC.methodC();
    }

    class ClassA {
        public void methodA() {
        }
    }

    class ClassB {
        public void methodB() {
        }
    }

    class ClassC {
        public void methodC() {
        }
    }
}
