package com.jin.pattern.decorator.decorator;

import com.jin.pattern.decorator.Battercake;

/**
 * 鸡蛋装饰
 * @author jinjin
 * @date 2019-03-20
 */
public class EggDecorator extends BattercakeDecorator {

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
