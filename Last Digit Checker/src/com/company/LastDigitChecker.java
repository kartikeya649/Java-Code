package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1,int num2,int num3){
        int digit1=num1%10;
        int digit2=num2%10;
        int digit3=num3%10;
        if(num1<10||num2<10||num3<10||num1>1000||num2>1000||num3>1000){
            return false;
        }else if(digit1==digit2||digit1==digit3||digit2==digit3){
            return true;
        }
        return false;
    }
    public static boolean isValid(int num){
        if(num>=10 && num<=1000){
            return true;
        }
        return false;
    }
}
