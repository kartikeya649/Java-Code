package com.company;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int numberCheck=0;
        int lastDigit=0;
        int sum=0;
        while (number>=1){
            lastDigit=number%10;
            if(lastDigit%2==0){
                sum+=lastDigit;
            }
            number/=10;
        }
        return sum;
    }
}
