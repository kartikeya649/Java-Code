package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue=Float.MIN_VALUE;
        float myMaxFloatValue=Float.MAX_VALUE;
        System.out.println("Float Minimum No.:"+ myMinFloatValue);
        System.out.println("Float Maximum No.:"+ myMaxFloatValue);

        double myMinDoubleValue=Double.MIN_VALUE;
        double myMaxDoubleValue=Double.MAX_VALUE;
        System.out.println("Double Minimum No.:"+ myMinDoubleValue);
        System.out.println("Double Maximum No.:"+ myMaxDoubleValue);

        int myIntValue=9/2;
        float myFloatValue=8.9f/3f;
        double myDoubleValue=20.09/3;
        System.out.println("MyIntValue:"+ myIntValue);
        System.out.println("MyFloatValue:" + myFloatValue);
        System.out.println("MyDoubleValue:"+ myDoubleValue);

        //Converting pound to KG

        double numberOfPounds=2000;
        double conertedkg=numberOfPounds*0.45359237;
        System.out.println("Converted Kilograms:" + conertedkg);

        //pi values

        double pi=3.1415927;
        double anotherNumber=3_000_000.4_567_890;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
