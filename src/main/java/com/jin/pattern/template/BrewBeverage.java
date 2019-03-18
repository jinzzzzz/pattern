package com.jin.pattern.template;

/**
 * 冲泡饮料
 * @author jinjin
 * @date 2019-03-18
 */
public abstract class BrewBeverage {

    /**
     * 准备过程，流程是固定的，所以不希望让子类覆盖此方法
     */
    final void prepare(){
        //烧开水
        this.boilWater();
        //冲泡
        this.brew();
        //倒入开水
        this.pourWater();
        //放入调料
        if(this.wantCondimen()) {
            this.addCondimen();
        }
    }

    final void boilWater(){
        System.out.println("烧开水");
    }

    //因为父类不知道子类需要冲泡的是什么，所以让子类实现
    abstract void brew();

    final void pourWater(){
        System.out.println("倒入开水");
    }

    abstract void addCondimen();

    boolean wantCondimen(){
        return true;
    }
}
