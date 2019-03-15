package com.jin.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理
 * @author jinjin
 * @date 2019-03-15
 */
public class JDKProxy implements InvocationHandler {

    //被代理的对象,可以是任意类型
    private Object target;

    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        //Proxy.newProxyInstance 三个参数分别是
        //ClassLoader loader 指定当前目标对象使用的类加载器
        //Class<?>[] interfaces 指定目标对象实现的接口的类型
        //InvocationHandler 指定动态处理器，执行目标对象的方法时,会处理器的invoke()方法
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before() {
        System.out.println("JDK动态代理-执行方法前");
    }

    private void after() {
        System.out.println("JDK动态代理-执行方法后");
    }
}
