package com.company;
public class CountMostAcurring {

    public int getTotalCount() {

        int[] numbers = {1, 2, 3, 2};
        int count = 0;
        int highestValue = 0;

        for (int i = 0; i < numbers.length; i++) {

            int digit = numbers[i];

            for (int j = 0; j < numbers.length; j++) {
                if (digit == numbers[j]) {
                    count++;

                }

                if(count > highestValue){
                    highestValue = count;
                }
            }
        }
        return highestValue;
    }
}
