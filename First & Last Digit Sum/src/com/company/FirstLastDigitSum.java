package com.company;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int sum=0;
        int lastDigit=number%10;
        sum+=lastDigit;
        while (number>=10){
            number/=10;
        }
        sum+=number;
        return sum;
    }
}
