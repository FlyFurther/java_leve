package com.hq.fileIo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by hq on 17/6/2.
 */
public class OutFile {

    public static void main(String[] args) {
        String conten = "";
        byte[] contentBytes = conten.getBytes();
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/hq/Desktop/testFile"));
            bos.write(contentBytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
