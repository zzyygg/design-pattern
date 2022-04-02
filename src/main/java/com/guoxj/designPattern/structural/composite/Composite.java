package com.guoxj.designPattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Guoxj
 * @version 1.0
 */
public class Composite implements Component {

    private List<Component> componentList = new ArrayList<>();

    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        componentList.remove(component);
    }

    public List<Component> getChild() {
        return componentList;
    }

    @Override
    public void operation() {

    }
}
