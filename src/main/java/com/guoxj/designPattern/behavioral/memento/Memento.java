package com.guoxj.designPattern.behavioral.memento;

/**
 * @author Guoxj
 * @version 1.0
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
