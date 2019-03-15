package com.jin.pattern.factory.simple;

import com.jin.pattern.factory.method.Pizza;

/**
 * 披萨商店
 * @author jinjin
 * @date 2019-03-10
 */
public class PizzaStore {
    private SimplePizzaFactory simplePizzaFactory;


    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    /**
     * 订购披萨
     */
    public Pizza orderPizza(String type){
        Pizza pizza = simplePizzaFactory.createPizza(type);

        return pizza;
    }
}
