package com.guoxj.designPattern.behavioral.mediator;

/**
 * 中介者模式
 * 定义：用一个中介对象封装一系列对象（同事）的交互，中介者使得各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立地改变它们之间的交互
 *
 * @author Guoxj
 * @version 1.0
 */
public class ConcreteMediator extends Mediator {

    private Colleague c1;
    private Colleague c2;

    @Override
    void colleagueChange(Colleague colleague) {
        c1.action();
        c2.action();
    }

    public void createColleague() {
        c1 = new Colleague(this) {
            @Override
            void action() {

            }
        };
        c2 = new Colleague(this) {
            @Override
            void action() {

            }
        };
    }

    public Colleague getC1() {
        return c1;
    }

    public Colleague getC2() {
        return c2;
    }
}
