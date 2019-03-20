package com.jin.pattern.decorator.decorator;

import com.jin.pattern.decorator.Battercake;

/**
 * 煎饼装饰类
 * @author jinjin
 * @date 2019-03-20
 */
public abstract class BattercakeDecorator extends Battercake{

    private Battercake battercake;
    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    public String getDesc() {
        return this.battercake.getDesc();
    }
    @Override
    public int getPrice() {
        return this.battercake.getPrice();
    }

}
