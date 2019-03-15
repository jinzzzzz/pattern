package com.jin.pattern.proxy.statics;

import com.jin.pattern.proxy.Subject;

/**
 * @author jinjin
 * @date 2019-03-15
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("执行方法前");
        subject.request();
        System.out.println("执行方法后");
    }
}
