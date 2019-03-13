package com.jin.pattern.singleton;

/**
 * 饿汉式单例
 * @author jinjin
 * @date 2019-03-13
 */
public class HungrySingleton {

    //私有构造方法，只有在HungrySingleton类中能使用构造器创建
    private HungrySingleton(){}

    //静态变量，类加载时初始化
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    //使用该方法获得实例对象
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
