package com.company;

public class Main {

    public static void main(String[] args) {
	int myValue=10000;
	int myMinValue=Integer.MIN_VALUE;
	int myMaxValue=Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value:"+ myMinValue);
        System.out.println("Integer Maximum Value:"+ myMaxValue);
        System.out.println("Busted Minimum Value:"+ (myMinValue+1));
        System.out.println("Busted Maximum Value:"+ (myMaxValue-1));
        
        int myMaxIntTest=2_147_483_647;

        byte myMinByteValue=Byte.MIN_VALUE;
        byte myMaxByteValue=Byte.MAX_VALUE;
            System.out.println("Byte Minimum Value:"+ myMinByteValue);
            System.out.println("Byte Maximum Value:"+ myMaxByteValue);

        short myMinShortValue=Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;
            System.out.println("Short Minimum Value:"+ myMinShortValue);
            System.out.println("Short Maximum Value:"+ myMaxShortValue);


        long myLongValue=1000;
        long myMinLongValue=Long.MIN_VALUE;
        long myMaxLongValue=Long.MAX_VALUE;
            System.out.println("long Minimum Value:"+ myMinLongValue);
            System.out.println("long Maximum Value:"+ myMaxLongValue);

        long bigLongLiteralValue=2_147_483_647_2434L;
        System.out.println(bigLongLiteralValue);
        
        
    }
}
