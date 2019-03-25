package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static ArrayList<Integer> Lists = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        int[] data = {40, 50, 10, 30, 20, 5};
        System.out.println(chop(50 , data));
    }


    public static int chop(int checkValue, int[] array) {
        int value = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == checkValue) {
                return i;
            } else {
                continue;
            }
        }
        return value;
//        ArrayList<String> obj = new ArrayList<String>(
//                Arrays.asList("moral", "jera", "uzl", ....so on));
//        return "moral";
    }
}
