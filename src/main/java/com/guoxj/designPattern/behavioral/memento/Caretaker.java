package com.guoxj.designPattern.behavioral.memento;

/**
 * @author Guoxj
 * @version 1.0
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
