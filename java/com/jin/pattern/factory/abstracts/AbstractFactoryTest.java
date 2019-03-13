package com.jin.pattern.factory.abstracts;

/**
 * 抽象工厂模式测试
 * @author jinjin
 * @date 2019-03-11
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new HangZhouPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza.toString());
    }
}
