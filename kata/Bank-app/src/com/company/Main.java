package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 0; i < 4; i++) {
            System.out.println("type in password");
            Scanner myObj = new Scanner(System.in);
            String name = myObj.nextLine();
            switch (name) {
                case "name":
                    System.out.println("correct");

            }

        }
    }
}