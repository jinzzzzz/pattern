package com.jin.pattern.decorator;

/**
 * 煎饼
 * @author jinjin
 * @date 2019-03-20
 */
public abstract class Battercake {

    //煎饼的做法
    public String getDesc(){
        return "未定义的煎饼";
    }

    //煎饼价格
    public abstract int getPrice();


}
