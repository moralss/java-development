import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        String result  = HighAndLow("3 4 3 3 2");
        System.out.println("answer " + result);
    }


    public static String HighAndLow(String numbers) {
            // Code here or
        String strArray[] = numbers.split(" ");
        System.out.println(strArray[0]);


        int minValue = parseInt(strArray[0]);
        int maxValue = parseInt(strArray[0]);

        for(int i = 0 ; i <  strArray.length ; i ++){
            if(minValue > parseInt(strArray[i])){
                minValue = parseInt(strArray[i]);
            }
            if(maxValue < parseInt(strArray[i])){
                maxValue = parseInt(strArray[i]);
            }

        }
        return maxValue + " " + minValue ;
    }



}
