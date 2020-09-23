package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(true){
            System.out.println("Enter your No.:");
            boolean isAnInt=scanner.hasNextInt();
            if (isAnInt){
                int number=scanner.nextInt();
                if(number>max){
                    max=number;
                }
                if(number<min){
                    min=number;
                }
            }else {
                break;
            }
            scanner.nextLine();//Handling Input
        }
        System.out.println("Min:"+min+", max:"+max);
        scanner.close();
    }
}
