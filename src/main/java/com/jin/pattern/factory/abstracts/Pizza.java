package com.jin.pattern.factory.abstracts;

/**
 * 披萨
 * @author jinjin
 * @date 2019-03-11
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    //将披萨准备原料的方法设置为抽象方法
    abstract void prepare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
