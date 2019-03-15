package com.jin.pattern.singleton;

/**
 * 懒汉式单例
 * @author jinjin
 * @date 2019-03-13
 */
public class LazySingleton {

    //私有构造方法，只有在LazySingleton类中能使用构造器创建
    private LazySingleton(){}

    //静态变量记录唯一实例
    private static LazySingleton lazy = null;

    //使用getInstance()方法实例化对象并且返回
    public static LazySingleton getInstance(){
        if(lazy == null){
            lazy = new LazySingleton();
        }
        return lazy;
    }
}
