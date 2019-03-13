package com.jin.pattern.factory.method;

/**
 * 简单工厂
 * @author jinjin
 * @date 2019-03-10
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String city,String type){
        Pizza pizza = null;
        if(city.equals("杭州")) {
            if (type.equals("cheese")) {
                return new HangZhouCheesePizza();
            } else if (type.equals("veggie")) {
                return new HangZhouVeggiePizza();
            } else if (type.equals("clam")) {
                return new HangZhouClamPizza();
            }
        }else if(city.equals("上海")){
            if (type.equals("cheese")) {
                return new ShangHaiCheesePizza();
            } else if (type.equals("veggie")) {
                return new ShangHaiVeggiePizza();
            } else if (type.equals("clam")) {
                return new ShangHaiClamPizza();
            }
        }
        return pizza;
    }
}
