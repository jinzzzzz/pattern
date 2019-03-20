package com.jin.pattern.decorator.decorator;

import com.jin.pattern.decorator.Battercake;

/**
 * 火腿装饰
 * @author jinjin
 * @date 2019-03-20
 */
public class SausageDecorator extends BattercakeDecorator {
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }
    @Override
    public String getDesc() {
        return super.getDesc() + "+1根香肠";
    }
    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
