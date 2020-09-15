package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("10,000 at 2% interest: "+ calculateInterest(10000,2.0));

        for (int i=0;i<9;i++){
            System.out.println("Loop " + i + " Hello Babe!");
        }
        //Challenge
        for (int i=0;i<9;i++){
            System.out.println("10,000 at "+i+"% interest: "+String.format("%.2f",calculateInterest(10000,i)));
        }
        System.out.println("###############################################################################");
        //Mini Challenge
        for (int i=8;i>=2;i--){
            System.out.println("10,000 at "+i+"% interest: "+String.format("%.2f",calculateInterest(10000,i)));
        }
        System.out.println("#####################################################");
        int count=0;
        for (int i=10;i<50;i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number "+i+" is a Prime Number");
                if (count==12){
                    System.out.println("End of The Loop");
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount,double interestRate){
        return(amount*(interestRate/100));
    }

}
