package com.jin.pattern.factory.method;

/**
 * 杭州披萨商店
 * @author jinjin
 * @date 2019-03-10
 */
public class HangZhouPizzaStore extends PizzaStore{
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new HangZhouCheesePizza();
        } else if (item.equals("veggie")) {
            return new HangZhouVeggiePizza();
        } else if (item.equals("clam")) {
            return new HangZhouClamPizza();
        }
        return null;
    }
}
