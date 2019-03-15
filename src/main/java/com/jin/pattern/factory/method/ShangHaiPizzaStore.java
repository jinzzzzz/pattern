package com.jin.pattern.factory.method;

/**
 * 上海披萨商店
 * @author jinjin
 * @date 2019-03-10
 */
public class ShangHaiPizzaStore extends PizzaStore{
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ShangHaiCheesePizza();
        } else if (item.equals("veggie")) {
            return new ShangHaiVeggiePizza();
        } else if (item.equals("clam")) {
            return new ShangHaiClamPizza();
        }
        return null;
    }
}
