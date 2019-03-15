package com.jin.pattern.singleton;

/**
 * 懒汉式双重校验锁
 * @author jinjin
 * @date 2019-03-13
 */
public class LazyDoubleCheckSingleton {

    //volatile保证线程可见性
    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton(){}
    public static LazyDoubleCheckSingleton getInstance(){
        //检查实例，如果不存在才进入同步代码块
        if(lazy == null){
            //只有在没有实例化时才会进行同步
            synchronized (LazyDoubleCheckSingleton.class){
                //进入同步块后再次检查，如果仍然没有实例，才创建实例
                if(lazy == null){
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }
}
