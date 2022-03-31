package com.guoxj.designPattern.creation.builder;

/**
 * 封装构造过程
 * 定义：将一个复杂对象的构建与它的表示分离
 *
 * @author Guoxj
 * @version 1.0
 */
public class Director {

    private  Product product;

    private Builder builder;

    public Director() {
        product = new Product();
        builder = new ConcreteBuilder();
    }

    public Product build() {
        builder.setPart1(product);
        builder.setPart2(product);
        builder.setPart3(product);
        return product;
    }

    @Override
    public Director clone() throws CloneNotSupportedException {
        return (Director) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Director director = new Director();
        Director clone = director.clone();
        System.out.println(director);
        System.out.println(clone);
    }

}
