package com.company;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber,double secondNumber){
        double num1=firstNumber*1000;
        double num2=secondNumber*1000;
        if((int)num1==(int)num2){
            return true;
        }else{
            return false;
        }
    }
}
