package main;

public class StringCalculator {

    public  int calculatorString(String sum){
        int total = 0;

        if(sum.contains(",")){
            String [] sumArray =  sum.split(",");
            for(int i = 0 ; i < sumArray.length ; i++){
                total += Integer.parseInt(sumArray[i]);
            }

            return total;

        }


        return Integer.parseInt(sum);
    }
}
