package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver=true;
        int score=800;
        int levelCompleted=5;
        int bonus=100;
        if (score<5000 && score>1000){
            System.out.println("Your score is less than 5000 & greater than 1000");
        }else if (score<1000){
            System.out.println("Your score is less than 1000");
        }else {
            System.out.println("Got Here");
        }
        if (gameOver){
            int finalScore=score+(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("Your final score was:"+ finalScore);
        }

        //New Challenge
        boolean newGameOver=true;
        int newScore=800;
        int newLevelCompleted=5;
        int newBonus=100;
        if (newGameOver){
            int finalScore=newScore+(newLevelCompleted*newBonus);
            System.out.println("Your final score was:"+ finalScore);
        }
    }
}
