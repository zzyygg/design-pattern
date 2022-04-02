package com.guoxj.designPattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Guoxj
 * @version 1.0
 */
public class ConcreteCollection<E> implements Collection<E> {

    private List<E> list = new ArrayList<>();

    @Override
    public void add(E e) {
        list.add(e);
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Iterator<E> iterator() {
        return new ConcreteIterator<>(this);
    }
}