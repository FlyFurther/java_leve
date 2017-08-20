package com.hq;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hq on 17/2/21.
 */
public class YHTriangle {
    public static void main(String[] args) {
        YHTriangle yhTriangle = new YHTriangle();
        List<Integer> list = new ArrayList<>();
        yhTriangle.yhTriangle(20, list, 1);
    }

    public void yhTriangle(int n, List<Integer> list, int i) {
        List<Integer> preList = list;
        int count = 0;
//        List<Integer> nextList = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j < i; j++) {
//                if ((2 < i) && (j == 1)) {
//                    nextList.add(1);
//                    System.out.print("1 ");
//                    continue;
//                }
//                if (i > 2) {
//                    int now = preList.get(j-2) + preList.get(j-1);
//                    nextList.add(now);
//                    System.out.print(now + " ");
//                } else {
//                    if (2 == i) {
//                        System.out.print("1 ");
//                        nextList.add(1);
//                    }
//                }
//            }
//            System.out.println(1);
//            nextList.add(1);
//            preList.removeAll(preList);
//            preList.addAll(nextList);
//            nextList.removeAll(nextList);
//        }

//        System.out.println("--------------------------");
//        preList.removeAll(preList);
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j < i; j++) {
//                if (i > 2 && j == 1) {
//                    preList.add(0, 1);
//                    System.out.print("1 ");
//                } else if (i == 2){
//                    System.out.print("1 ");
//                    preList.add(1);
//                } else {
//                    int now = preList.get(j - 2) + preList.get(j - 1);
//                    System.out.print(now + " ");
//                    preList.set(j - 2, now);
//                }
//            }
//            System.out.println(1);
//        }

        if (i > n) {
            return;
        }
        for (int row = i; row <= n; row++) {
            System.out.print("     ");
            count++;
        }
        for (int j = 1; j < i; j++) {
                if (i > 2 && j == 1) {
                    preList.add(0, 1);
                    System.out.print("1          ");
                } else if (i == 2){
                    System.out.print("1          ");
                    preList.add(1);
                } else {
                    int now = preList.get(j - 2) + preList.get(j - 1);
                    System.out.print(now + "          ");
                    preList.set(j - 2, now);
                }
            }
            System.out.println("1");
        yhTriangle(n, preList, i+1);
    }
}
