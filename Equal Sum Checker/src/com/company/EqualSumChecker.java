package com.company;

public class EqualSumChecker {
    public static boolean hasEqualSum(int num1,int num2,int num3){
        int num4=num1+num2;
        if ((int)num4==(int)num3){
            return true;
        }else {
            return false;
        }
    }
}
