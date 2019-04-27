package com.company;

import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> numbers = Arrays.asList(1, 3, 5, 4, 2);
        List<String> names = Arrays.asList("Alex", "Charles", "Brian", "David");

        numbers.sort( Comparator.comparing( Integer::valueOf ));
        names.sort( Comparator.comparing( String::toString ) );
        names.sort(Comparator.comparing(String::toString).reversed());
        System.out.println(names);
    }

}


