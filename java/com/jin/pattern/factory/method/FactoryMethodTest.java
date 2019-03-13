package com.jin.pattern.factory.method;

/**
 * 工厂方法模式测试
 * @author jinjin
 * @date 2019-03-10
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new HangZhouPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("clam");
        System.out.println(pizza.toString());
    }
}
