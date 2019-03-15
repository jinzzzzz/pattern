package com.jin.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化破坏单例
 * @author jinjin
 * @date 2019-03-13
 */
public class SeriableSingletonTest {
    public static void main(String[] args) {
        LazyInsideSingleton s1 = null;
        LazyInsideSingleton s2 = LazyInsideSingleton.getInstance();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingletonTest.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("SeriableSingletonTest.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (LazyInsideSingleton) ois.readObject();
            ois.close();
            //运行结果为false，因为创建了多个实例
            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
