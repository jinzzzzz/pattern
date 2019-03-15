package com.jin.pattern.proxy;

/**
 * @author jinjin
 * @date 2019-03-15
 */
public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("RealSubject收到请求并处理完成");
    }
}
