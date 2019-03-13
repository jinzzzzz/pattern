package com.jin.pattern.factory.abstracts;

/**
 * 杭州披萨商店
 * @author jinjin
 * @date 2019-03-10
 */
public class HangZhouPizzaStore extends PizzaStore{
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new HangZhouPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("杭州芝士披萨");

        }else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("杭州蛤蜊披萨");

        }
        return pizza;
    }
}
