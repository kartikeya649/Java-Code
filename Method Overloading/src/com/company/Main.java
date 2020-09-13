package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore=calculateScore("Tillu",900);
        System.out.println("New Score is "+newScore);
        calculateScore(890);
        calculateScore();
        double centimeters=calcFeetAndInchesToCentimeters(20,7);
        if(centimeters<0.0){
            System.out.println("Invalid Parameters");
        }
        calcFeetAndInchesToCentimeters(290);

    }
    public static int calculateScore(String playerName,int score){
        System.out.println("Player "+playerName+" scored "+score+" points");
        return score*200;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored "+score+" points");
        return score;
    }
    public static int calculateScore(){
        System.out.println("No Player,No player scored points");
        return 0;
    }
    //Challenge
    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if (feet<0|| inches<0 && inches>12){
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters=(feet*12)*2.54;
        centimeters+=inches*2.54;
        System.out.println(feet+" feet, "+inches+" inches= "+centimeters+" cm");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches<0){
            return -1;
        }
        double feet=(int) inches/12;
        double remainingInches=(int)inches % 12;
        System.out.println(inches+" inches is equal to "+feet+" feet & "+remainingInches);
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }

}
