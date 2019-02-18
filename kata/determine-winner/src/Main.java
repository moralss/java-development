import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        String[] points = {"2:2" , "1:3" , "3:1"};
        int totalPoints = getWinner(points);
        System.out.println("totaPoints" + totalPoints);
    }


    public static int getWinner(String[] games) {

        String[] numbers = {};
        int points = 0;

        for(int i = 0 ; i < games.length ; i++){
            int teamScore = parseInt(games[i].split(":")[0]);
            int opponentScore = parseInt(games[i].split(":")[1]);

            if(teamScore > opponentScore ){
                points += 3;
            }

            if(teamScore == opponentScore){
                points += 1;
            }

        }


        //implement me
        return points;

    }
}



