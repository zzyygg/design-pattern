package com.guoxj.designPattern.behavioral.state;

/**
 * @author Guoxj
 * @version 1.0
 */
public class Context {

    public static State STATE1 = new ConcreteState1();
    public static State STATE2 = new ConcreteState2();

    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        currentState.setContext(this);
    }

    public void handle1() {
        setCurrentState(STATE1);
        currentState.handle();
    }

    public void handle2() {
        setCurrentState(STATE2);
        currentState.handle();
    }
}
