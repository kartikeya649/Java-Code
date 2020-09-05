package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte byteValue=10;
        short shortValue=20;
        int intValue=80;

        long longTotal=50000L+10L*(byteValue+shortValue+intValue);
        System.out.println(longTotal);

        short shortTotal=(short)(1000+10*(byteValue+shortValue+intValue));
    }
}
