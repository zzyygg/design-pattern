package com.guoxj.designPattern.behavioral.iterator;

/**
 * @author Guoxj
 * @version 1.0
 */
public interface Iterator<E> {
    E next();
    boolean hasNext();
}
