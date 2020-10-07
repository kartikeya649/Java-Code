package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1,int num2){
        if((num1<10||num1>99)||(num2<10||num2>99)){
            return false;
        }
        int lastDigit1=num1%10;
        num1/=10;

        int lastDigit2=num2%10;
        num2/=10;

        if((lastDigit1==lastDigit2)||(num1==num2)||(lastDigit1==num2)||(lastDigit2==num1)){
            return true;
        }else {
            return false;
        }
    }
}
