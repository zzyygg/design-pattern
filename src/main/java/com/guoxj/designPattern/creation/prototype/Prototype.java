package com.guoxj.designPattern.creation.prototype;

/**
 * 原型模式
 * 定义：用原型实例指定创建对象的种类，并且通过复制这些原型创建新的对象
 * 注意：Object的clone()为浅克隆（如果对象包含引用类型属性，克隆之后和原对象引用的是同一个对象）, 深克隆需要手动控制
 *
 * @author Guoxj
 * @version 1.0
 */
public class Prototype implements Cloneable {

    public Attr attr;

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public Prototype deeplyClone() throws CloneNotSupportedException {
        Prototype prototype = clone();
        prototype.setAttr(new Attr() {{
            setStr(getAttr().getStr());
        }});
        return prototype;
    }

    public Attr getAttr() {
        return attr;
    }

    public void setAttr(Attr attr) {
        this.attr = attr;
    }

    class Attr implements Cloneable{

        private String str;

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }

}
