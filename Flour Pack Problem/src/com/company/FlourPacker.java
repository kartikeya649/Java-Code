package com.company;

public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
        if(smallCount>=goal){
            return true;
        }
        for (int i=1;i<=bigCount;i++){
            if (i*5==goal){
                return true;
            }
            for (int j=1;j<=smallCount;j++){
                if ((i*5)+j==goal){
                    return true;
                }
            }
        }
        return false;
    }
}
