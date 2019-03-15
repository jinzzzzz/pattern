package com.jin.pattern.proxy;

/**
 * @author jinjin
 * @date 2019-03-15
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Subject subject = (Subject)new CglibProxy().getInstance(RealSubject.class);
        subject.request();
    }

    /*public static void main(String[] args) throws Exception{
       Subject subject = (Subject)new JDKProxy().getInstance(new RealSubject());
       subject.request();
    }*/

    /*public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }*/
}
