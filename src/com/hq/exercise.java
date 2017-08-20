package com.hq;

/**
 * Created by hq on 17/2/15.
 */
public class exercise {

    public static void main(String[] args) {
        exercise ex = new exercise();
        ex.tri(7, 1);
    }

    public void tri(int n, int now) {
        int count = 0;
        int half = n;

//        for (int i = 1; i <= half; i++) {
//            for(int j = i; j <= half; j++) {
//                System.out.print(" ");
//                count++;
//            }
//            System.out.print("*");
//            if (count != half ) {
//                for (int j = count; j != half ; j++) {
//                    System.out.print(" *");
//                }
//            }
//            System.out.println();
//            count = 0;
//        }

//        System.out.println("------------------------------------");

        if (now >= half) {
            return;
        }
        for (int i = now; i <= n; i++) {
            System.out.print(" ");
            count++;
        }
        System.out.print("*");
        if (count != half ) {
            for (int j = count; j != half ; j++) {
                System.out.print(" *");
            }
        }
        System.out.println();
        tri(n, now+1);
    }
}
