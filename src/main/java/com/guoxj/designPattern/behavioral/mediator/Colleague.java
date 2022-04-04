package com.guoxj.designPattern.behavioral.mediator;

/**
 * @author Guoxj
 * @version 1.0
 */
public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void action();

    public void change() {
        mediator.colleagueChange(this);
    }
}
