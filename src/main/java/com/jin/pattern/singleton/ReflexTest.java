package com.jin.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * 反射破坏单例
 * @author jinjin
 * @date 2019-03-13
 */
public class ReflexTest {
    public static void main(String[] args) throws Exception{
        LazyInsideSingleton s1 = null;
        LazyInsideSingleton s2 = LazyInsideSingleton.getInstance();
        Class<?> clazz = LazyInsideSingleton.class;
        Constructor c = clazz.getDeclaredConstructor(null);
        //强制访问私有方法
        c.setAccessible(true);
        //使用反射的newInstance()创建实例
        s1 = (LazyInsideSingleton)c.newInstance();
        //运行结果为false，因为创建了多个实例
        System.out.println(s1 == s2);
    }
}
