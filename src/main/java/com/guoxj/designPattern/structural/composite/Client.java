package com.guoxj.designPattern.structural.composite;

/**
 * 组合模式
 * 定义：将对象组合成树形结构以表示”部分-整体“的层次结构，使得用户对单个对象和组合对象的使用具有一致性
 *
 * @author Guoxj
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Composite root = new Composite();
        root.operation();
        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
        display(root);
    }

    public static void display(Composite root) {
        for (Component component : root.getChild()) {
            if (component instanceof Leaf) {
                component.operation();
            } else {
                component.operation();
                display((Composite) component);
            }
        }
    }
}
