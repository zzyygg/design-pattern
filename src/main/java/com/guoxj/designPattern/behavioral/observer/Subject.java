package com.guoxj.designPattern.behavioral.observer;

/**
 * @author Guoxj
 * @version 1.0
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
}
