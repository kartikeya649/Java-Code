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
    }
}
