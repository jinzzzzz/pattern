package com.jin.pattern.factory.simple;

import com.jin.pattern.factory.method.ClamPizza;
import com.jin.pattern.factory.method.GreekPizza;
import com.jin.pattern.factory.method.Pizza;
import com.jin.pattern.factory.method.VeggiePizza;

/**
 * 简单工厂
 * @author jinjin
 * @date 2019-03-10
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("clam")){
            pizza = new ClamPizza();
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }else if(type.equals("greek")){
            pizza = new GreekPizza();
        }
        return pizza;
    }
}
