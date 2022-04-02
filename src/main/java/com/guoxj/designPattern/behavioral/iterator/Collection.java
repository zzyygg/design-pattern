package com.guoxj.designPattern.behavioral.iterator;

/**
 * @author Guoxj
 * @version 1.0
 */
public interface Collection<E> {
    void add(E e);
    E get(int index);
    int size();
    Iterator<E> iterator();
}
