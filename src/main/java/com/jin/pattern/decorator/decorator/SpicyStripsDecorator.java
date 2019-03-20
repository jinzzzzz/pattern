package com.jin.pattern.decorator.decorator;

import com.jin.pattern.decorator.Battercake;

/**
 * 辣条装饰
 * @author jinjin
 * @date 2019-03-20
 */
public class SpicyStripsDecorator extends BattercakeDecorator{

    public SpicyStripsDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "+1包辣条";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
