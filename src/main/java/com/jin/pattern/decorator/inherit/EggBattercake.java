package com.jin.pattern.decorator.inherit;

import com.jin.pattern.decorator.Battercake;

/**
 * 鸡蛋煎饼
 * @author jinjin
 * @date 2019-03-20
 */
public class EggBattercake extends Battercake {

    @Override
    public String getDesc() {
        return "鸡蛋煎饼";
    }

    @Override
    public int getPrice() {
        return 6;
    }
}
