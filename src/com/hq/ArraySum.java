package com.hq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hq on 17/8/1.
 */
public class ArraySum {
    public static List<Integer> nowList = new ArrayList<>();
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5,6};
        Integer[] arr2 = new Integer[]{2,4,5,6,7,2};
        item(Arrays.asList(arr), Arrays.asList(arr2), 0, 0);
//        sum(arr, 0, 10);
    }

    public void arraySum(int[] arr, int sum, int index, int res) {
        if (index >= arr.length || sum > res) {
            return;
        }
        if (sum == res) {
            System.out.println(index);
            return;
        }
        sum += arr[index];
        arraySum(arr, sum, index++, res);
    }

    public void operation() {

    }

    public static void sum(int[] arr, int index, int sum) {
        if (index >= arr.length -1) {
            return;
        }
        for (int i = index+1; i < arr.length; i++) {
            if (arr[index] + arr[i] == sum) {
                System.out.println("[" +arr[index] +"," + arr[i] + "]");
            }
        }
        sum(arr, index+1, sum);
    }

    public static void item(List<Integer> arr1, List<Integer> arr2, int con1, int con2) {
        if (con1 > arr1.size() && con2 > arr2.size()) {
            return;
        }
        if (con1 > con2) {
            if (con2 >= arr2.size()) {
                con2 = arr2.size()-1;
            }
        } else {
            if (con1 >= arr1.size()) {
                con1 = arr1.size()-1;
            }
        }
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; i< arr2.size(); j++) {
                System.out.println(arr1.subList(i, con1).toString() + "&" + arr2.subList(j, con2+j).toString());
            }
        }
        item(arr1, arr2, con1+1, con2+1);
    }
}
