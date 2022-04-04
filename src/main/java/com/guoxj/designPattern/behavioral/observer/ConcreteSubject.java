package com.guoxj.designPattern.behavioral.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Guoxj
 * @version 1.0
 */
public class ConcreteSubject implements Subject {

    private Vector<Observer> observers;

    public ConcreteSubject() {
        observers = new Vector<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public Enumeration<Observer> observers() {
        return observers.elements();
    }

    public void change() {
        notifyObserver();
    }
}
