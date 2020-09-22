package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("The sum of the digits is Number 125 is "+sumDigits(125));
        System.out.println("The sum of the digits is Number 480384 is "+sumDigits(480384));
        System.out.println("The sum of the digits is Number -2512 is "+sumDigits(-2512));
        System.out.println("The sum of the digits is Number 128905 is "+sumDigits(128905));
        System.out.println("The sum of the digits is Number 12115 is "+sumDigits(12115));

    }
    private static int sumDigits(int Number){
        if(Number<10){
            return -1;
        }
        int sum=0;

        while (Number>0){
            //Extract the lest-significant digit
            int digit=Number%10;
            sum+=digit;

            //drop the least-significant digit
            Number/=10;
        }
        return sum;
    }
}
