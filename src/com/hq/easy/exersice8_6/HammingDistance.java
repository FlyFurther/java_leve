package com.hq.easy.exersice8_6;

import java.util.Scanner;

/**
 * Created by hq on 17/8/6.
 */
public class HammingDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hammingD = hammingDistance(1577962638, 1727613287);
        System.out.println("hammmingD=" + hammingD);
    }

    public static int hammingDistance(int x, int y) {

        x = x & 0xFFFFFFFF;
        y = y & 0xFFFFFFFF;

        int middle = x ^ y;
        middle = middle & 0xFFFFFFFF;
        int hammingD = 0;
        while (middle != 0) {
            if ((middle & (1 & 0xFFF)) == 1) {
                hammingD++;
            }
            middle >>= 1;
        }

        return hammingD;
    }
}
