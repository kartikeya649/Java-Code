package com.company;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num){
        int sum=0;
        if(num<=0){
            return false;
        }
        for (int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            return true;
        }
        return false;
    }

}
