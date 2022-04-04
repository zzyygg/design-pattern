package com.guoxj.designPattern.behavioral.Visitor;

import java.util.Random;
import java.util.Vector;

/**
 * @author Guoxj
 * @version 1.0
 */
public class ObjectStructure {

    private Vector<Element> elements;

    public ObjectStructure() {
        this.elements = new Vector<>();
    }

    public void action(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }

    public void add(Element element) {
        elements.add(element);
    }

    public void createElements() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            add(random.nextInt(100) > 50 ? new ConcreteElementA() : new ConcreteElementB());
        }
    }
}
