package com.hq;

import java.util.Scanner;

/**
 * Created by hq on 17/2/26.
 */
public class A_ZDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        countChar(str);
    }

    public static void countChar(String str) {
        int count = 0;
        int index = 0;
        while (str.length() != 0) {
            char ch = str.charAt(0);
            for (int i = 0; i < str.length(); i++) {
                if (i == 0) {
                    index = str.indexOf(ch+"", 0);
                } else {
                    index = str.indexOf(ch + "", index + 1);
                }
                if (index >= 0) {
                    count++;
                } else {
                    break;
                }
            }
            System.out.println(ch + "=" + count);
            count = 0;
            str = str.replaceAll(""+ch, "");
        }
    }
}
