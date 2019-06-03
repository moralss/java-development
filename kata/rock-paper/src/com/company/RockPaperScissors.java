package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class RockPaperScissors {
    public ArrayList<String> cpuOpition;

    RockPaperScissors(){
        this.cpuOpition = new ArrayList<>();
        this.cpuOpition.add("rock");
        this.cpuOpition.add("paper");
        this.cpuOpition.add("scissor");

    }

    public  String generateCpuGuess(){
        int randomNumber =  (int) Math.floor(Math.random() * 3);
        String cpuGuess = this.cpuOpition.get(randomNumber);
        return cpuGuess;

    }

    public String determineWinner(String userInput){
        String computerGuess = this.generateCpuGuess();
        if(userInput == computerGuess) return "draw";

        if(userInput == "rock"){
            if(computerGuess == "scissor") return "you win : scissor";
            if(computerGuess == "paper") return "you lost : paper";
        }

        else if(userInput == "paper"){
            if(computerGuess == "scissor") return "you lost : scissor";
            if(computerGuess == "rock") return "you win : rock";

        }

        else if(userInput == "scissor"){
            if(computerGuess == "rock") return "you lost : rock";
            if(computerGuess == "paper") return "you win : paper";
        }

        return null;
    }

}
