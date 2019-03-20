package com.jin.pattern.decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 小写流
 * @author jinjin
 * @date 2019-03-20
 */
public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream inputStream){
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int result = super.read();
        return result == -1 ? result : Character.toLowerCase(result);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off;i < off + result; i++){
            b[i] =  (byte)Character.toLowerCase(b[i]);
        }
        return result;
    }
}
