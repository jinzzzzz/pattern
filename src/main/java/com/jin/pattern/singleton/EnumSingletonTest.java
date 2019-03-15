package com.jin.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 枚举式单例测试
 * @author jinjin
 * @date 2019-03-13
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
       try {
            EnumSingleton instance1 = null;
            EnumSingleton instance2 = EnumSingleton.getInstance();
            instance2.setSingleton(new Object());
            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance2);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance1 = (EnumSingleton) ois.readObject();
            ois.close();
            System.out.println(instance1.getSingleton());
            System.out.println(instance2.getSingleton());
            System.out.println(instance1.getSingleton() == instance2.getSingleton());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
