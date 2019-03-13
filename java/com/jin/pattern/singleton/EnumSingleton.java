package com.jin.pattern.singleton;

/**
 * 枚举式单例
 * @author jinjin
 * @date 2019-03-13
 */
public enum EnumSingleton {
    INSTANCE;
    private Object singleton;

    public Object getSingleton() {
        return singleton;
    }

    public void setSingleton(Object singleton) {
        this.singleton = singleton;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
