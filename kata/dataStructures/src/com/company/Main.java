package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        LinkedList<String> linkedlist = new LinkedList<>();
        Map<String, String> names = new HashMap<>();
        Set<String> members = new HashSet<>();
        generateRandomPassword(9);

    }


    public static void generateRandomPassword(Integer length) {
        String characters = "ABCDEFGHIJKLOMOPQRSTUVWXYZ";
        char [] valuess = new char[length];
        List<Character> passwordChar = new ArrayList<>();
        int randomNumber;

        for(int i = 0 ; i < length ; i++){
            randomNumber = (int) (Math.random() * characters.length());
            passwordChar.add(characters.charAt(randomNumber));

        }
    }

}


