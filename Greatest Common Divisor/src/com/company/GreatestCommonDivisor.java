package com.company;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int a,int b){
        if(a<10||b<10){
            return -1;
        }
        int divisor=0;
        for (int i=1;i<=a||i<=b;i++){
            if(a%i==0 && b%i==0){
                divisor=i;
            }
        }
        return divisor;
    }
}
