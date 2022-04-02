package com.guoxj.designPattern.behavioral.iterator;


/**
 * 迭代器模式
 * 定义：提供一种方法访问一个容器对象中的各个元素，而又不暴露该对象的内部细节
 *
 * @author Guoxj
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Collection<String> collection = new ConcreteCollection<String>() {{
           add("Hello");
           add("World");
        }};
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
