package com.jin.pattern.factory.abstracts;

/**
 * 专门生产原料的工厂
 * @author jinjin
 * @date 2019-03-11
 */
public interface PizzaIngredientFactory {
    //生产面团
    Dough createDough();
    //生产酱料
    Sauce createSauce();
    //生产芝士
    Cheese createCheese();
    //生产蔬菜
    Veggies[] createVeggies();
    //生产意大利辣味香肠
    Pepperoni createPepperoni();
    //生产蛤蜊
    Clams createClam();
}
