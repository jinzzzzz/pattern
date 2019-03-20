package com.jin.pattern.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author jinjin
 * @date 2019-03-20
 */
public class InputStreamTest {
    public static void main(String[] args) throws Exception{
        int result;
        InputStream inputStream =
                new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
        while ((result=inputStream.read())>=0){
            System.out.println((char)result);
        }
        inputStream.close();
    }
}
