package com.jin.pattern.factory.simple;

/**
 * 简单工厂模式测试类
 * @author jinjin
 * @date 2019-03-10
 */
public class SimplePizzaFactoryTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        System.out.println(pizzaStore.orderPizza("clam"));
    }
}
