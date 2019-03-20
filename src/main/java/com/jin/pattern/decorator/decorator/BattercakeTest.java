package com.jin.pattern.decorator.decorator;

import com.jin.pattern.decorator.Battercake;

/**
 * 煎饼测试
 * @author jinjin
 * @date 2019-03-20
 */
public class BattercakeTest {
    public static void main(String[] args) {
        //我们要一个辣条鸡蛋煎饼,先创建一个煎饼
        Battercake battercake = new BaseBattercake();
        //用辣条装饰煎饼
        battercake = new SpicyStripsDecorator(battercake);
        //用鸡蛋装饰煎饼
        battercake = new EggDecorator(battercake);
        //输出结果:煎饼做法:基础煎饼+1包辣条+1个鸡蛋,价格:7元
        System.out.println("煎饼做法:"+battercake.getDesc()+",价格:"+battercake.getPrice()+"元");


        //或者我们要一个辣条火腿鸡蛋煎饼
        battercake = new BaseBattercake();
        //用辣条装饰煎饼
        battercake = new SpicyStripsDecorator(battercake);
        //用火腿装饰煎饼
        battercake = new SausageDecorator(battercake);
        //用鸡蛋装饰煎饼
        battercake = new EggDecorator(battercake);
        //输出结果:基础煎饼+1包辣条+1根香肠+1个鸡蛋,价格:8元
        System.out.println("煎饼做法:"+battercake.getDesc()+",价格:"+battercake.getPrice()+"元");
    }
}
