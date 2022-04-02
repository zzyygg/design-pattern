package com.guoxj.designPattern.behavioral.iterator;

/**
 * @author Guoxj
 * @version 1.0
 */
public class ConcreteIterator<E> implements Iterator<E> {

    private Collection<E> collection;

    private int index = 0;

    public ConcreteIterator(Collection<E> collection) {
        this.collection = collection;
    }

    @Override
    public E next() {
        return collection.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < collection.size();
    }
}
