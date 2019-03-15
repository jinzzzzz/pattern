package com.jin.pattern.singleton;

import java.io.Serializable;

/**
 * 静态内部类
 * @author jinjin
 * @date 2019-03-13
 */
public class LazyInsideSingleton implements Serializable {

    private LazyInsideSingleton(){}

    public static LazyInsideSingleton getInstance(){
        //在返回前，会先加载内部类,这种方法不仅保证了单例的唯一性，同时也延迟了单例的实例化
        return LazyHolder.LAZY;
    }

    //由内部类持有实例，内部类默认是不加载的,只有在getInstance()方法第一次被调用时才被加载
    private static class LazyHolder{
        private static final LazyInsideSingleton LAZY = new LazyInsideSingleton();
    }

    //反序列化返回对象
    /*private Object readResolve(){
        return LazyHolder.LAZY;
    }*/
}
