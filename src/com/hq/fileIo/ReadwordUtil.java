package com.hq.fileIo;


/**
 * Created by hq on 17/6/14.
 */
public class ReadwordUtil {
    public static void main(String[] args) {
        String str = "a///b//b/c";
        str = str.replaceAll("[/]{2,}", "/");
        System.out.println(str);
    }
}
