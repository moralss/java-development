package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> names = new ArrayList<String>();
        names.add("Moral");
        names.add("Zulu");
        names.add("Sbu");
        // get a value
        String name = names.get(1);
        for (String student : names) {
            System.out.println(student);
        }

        // update a value
        names.set(1, "Fred");


        // removing a value
        names.remove(2);

        Collections.sort(names);

        System.out.println("fetched name" + " " + name);
        System.out.println(names);
    }
}
