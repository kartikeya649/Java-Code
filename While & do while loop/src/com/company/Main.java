package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //While Loop
        int number=4;
        int finishNumber=20;
        int evenNumbersFound=0;
        while (number<=finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even Number:"+number);
            evenNumbersFound++;
            if (evenNumbersFound>=5){
                break;
            }
        }
        System.out.println("Total even numbers found:"+evenNumbersFound);
        System.out.println("###############################################");
        //Do while Loop
        int count=20;
        count=1;
        do {
            System.out.println("Count value was:"+count);
            count++;
        }while (count!=20);

    }
    public static boolean isEvenNumber(int number){
        if ((number%2)==0){
            return true;
        }
        return false;
    }
}
