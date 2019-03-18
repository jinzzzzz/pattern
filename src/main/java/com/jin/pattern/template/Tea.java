package com.jin.pattern.template;

/**
 * 茶
 * @author jinjin
 * @date 2019-03-18
 */
public class Tea extends BrewBeverage {

    private boolean wantCondimen;

    //泡茶时告知是否需要加入调料
    public Tea(boolean wantCondimen) {
        this.wantCondimen = wantCondimen;
    }

    @Override
    void brew() {
        System.out.println("放入茶叶");
    }

    @Override
    void addCondimen() {
        System.out.println("放柠檬");
    }

    //覆盖父类的方法
    @Override
    boolean wantCondimen(){
        return wantCondimen;
    }
}
