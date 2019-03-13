package com.jin.pattern.factory.abstracts;


/**
 * 披萨商店
 * @author jinjin
 * @date 2019-03-10
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        return pizza;
    }

    abstract Pizza createPizza(String item);
}
