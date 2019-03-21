package com.jin.pattern.decorator.io;

import java.io.*;

/**
 * @author jinjin
 * @date 2019-03-20
 */
public class InputStreamTest {
    public static void main(String[] args) throws Exception{
        int result;
        //创建字节数组流作为被装饰的对象
        InputStream inputStream = new ByteArrayInputStream("AAA".getBytes());
        //使用读到缓冲区的功能装饰字节数组流
        inputStream = new BufferedInputStream(inputStream);
        //使用我们编写的转为小写字符的功能装饰字节数组流
        inputStream = new LowerCaseInputStream(inputStream);

        while ((result=inputStream.read())>=0){
            //输出结果 aaa
            System.out.print((char)result);
        }
        inputStream.close();

        System.out.println("");
        //我们也可以创建文件流,读取文件中的数据
        inputStream =new FileInputStream("test.txt");
        //使用读到缓冲区的功能装饰文件流
        inputStream =new BufferedInputStream(inputStream);
        //使用我们编写的转为小写字符的功能装饰字节文件流
        inputStream =new LowerCaseInputStream(inputStream);
        while ((result=inputStream.read())>=0){
            //将文件中的所有大写字符转为小写输出
            System.out.print((char)result);
        }
        inputStream.close();
    }
}
