package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your year of birth: ");

        boolean hasNextInt=scanner.hasNextInt();
        if(hasNextInt){
            int yearOfBirth=scanner.nextInt();
            scanner.nextLine();//Handle Next Line Character

            System.out.println("Enter your Name: ");
            String name=scanner.nextLine();
            int age=2020-yearOfBirth;

            if(age>=0 && age<=150) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            }else {
                System.out.println("Invalid Year of Birth");
            }
        }else {
            System.out.println("Unable to parse year of Birth");
        }


        System.out.println("####################Challenge########################");


        int counter=0;
        int sum=0;

        //while (true){
        while (counter<10){
            int order=counter+1;
            System.out.println("Enter Number # "+order+":");

            boolean isAnInt=scanner.hasNextInt();
            if (isAnInt){
                int number=scanner.nextInt();
                counter++;
                sum+=number;
                /*if (counter==10){
                    break;
                }*/
            }else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();//Handle end of the line
        }
        System.out.println("sum: "+sum);
        scanner.close();
    }
}
