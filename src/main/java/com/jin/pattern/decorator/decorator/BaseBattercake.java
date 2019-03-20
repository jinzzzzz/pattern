package com.jin.pattern.decorator.decorator;

import com.jin.pattern.decorator.Battercake;

/**
 * 基础煎饼
 * @author jinjin
 * @date 2019-03-20
 */
public class BaseBattercake extends Battercake {
    @Override
    public String getDesc() {
        return "基础煎饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
