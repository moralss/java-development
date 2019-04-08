package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("original list: " + numbers);

        List<Integer> numbersDouble = numbers.stream()
                .map(s -> s * 2)
                .collect(Collectors.toList());

        List<Integer> filterList = numbers.stream()
                .filter(value -> value > 3)
                .collect(Collectors.toList());

        int total = numbers.stream().reduce(0, (x,y) -> x+y);

        System.out.println(total);
    }
}
