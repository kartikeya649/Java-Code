package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        calculateScore(true,800,5,100);
        calculateScore(true,10000,8,200);

        int highScorePosition=calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition=calculateHighScorePosition(900);
        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition=calculateHighScorePosition(400);
        displayHighScorePosition("TIllu",highScorePosition);

        highScorePosition=calculateHighScorePosition(50);
        displayHighScorePosition("Billu",highScorePosition);

        highScorePosition=calculateHighScorePosition(2200);
        displayHighScorePosition("Tabaoot",highScorePosition);

    }

    public static void displayHighScorePosition(String playerName,int highScorePosition){
        System.out.println(playerName+" Managed to get into position "+ highScorePosition +" on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
/*        if (playerScore>=1000){
            return 1;
        }else if(playerScore>=500){
            return 2;
        }else if(playerScore>=100){
            return 3;
        }
        return 4;
    }
*/
    //2nd Way

        int position=4;//assuming position 4 will be returned
             if (playerScore>=1000){
                position= 1;
             }else if(playerScore>=500){
                position= 2;
            }else if(playerScore>=100){
                position=3;
            }
             return position;
    }
        public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){

            if (gameOver){
                int finalScore=score+(levelCompleted*bonus);
                finalScore+=1000;
                System.out.println("Your final score was:"+ finalScore);
            }
        }
}
