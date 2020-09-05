package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString="How are you?";
        System.out.println("Hello" + myString);
        myString+="I am back babe.";
        System.out.println("Hello" + myString);
        myString+="\u00A9 2020";
        System.out.println("Hello" + myString);
        String myNumberString="280.90";
        myNumberString+="90090.90";
        System.out.println(myNumberString);
        String lastString="90";
        int myInt=90;
        lastString+=myInt;
        System.out.println("Last String is:"+ lastString);
        double doubleNumber=190.90;
        lastString+=doubleNumber;
        System.out.println("Last String is:"+ lastString);

    }
}
