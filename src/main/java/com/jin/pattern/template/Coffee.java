package com.jin.pattern.template;

/**
 * 咖啡
 * @author jinjin
 * @date 2019-03-18
 */
public class Coffee extends BrewBeverage {

    @Override
    void brew() {
        System.out.println("放入咖啡粉");
    }

    @Override
    void addCondimen() {
        System.out.println("放入牛奶和糖");
    }
}
