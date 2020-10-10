package com.company;

public class DiagonalStar {
    public static void printSquareStar(int number){

        char star = '*';
        int rowNumber;
        int colNumber;

        if (number < 5){
            System.out.println("Invalid Value");
        }else{
            for (rowNumber = 1; rowNumber <= number; rowNumber++){
                for(colNumber = 1; colNumber <= number; colNumber++){
                    if ((rowNumber == 1) || (rowNumber == number)){
                        System.out.print(star);
                    }
                    else if ((colNumber == 1) || (colNumber == number)){
                        System.out.print(star);
                    }
                    else if (rowNumber == colNumber){
                        System.out.print(star);
                    }
                    else if (colNumber == ((number - rowNumber) + 1)){
                        System.out.print(star);
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
