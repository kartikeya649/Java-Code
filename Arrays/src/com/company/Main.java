package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
/*        int[] myIntArray=new int[26];// { 1,2,3,4,5,6,7,8,9,10}

        for(int i=0;i<myIntArray.length;i++){
            myIntArray[i]=i*19;
        }
  //      for (int i=0;i<myIntArray.length;i++){
  //          System.out.println("Element "+i+", value is "+myIntArray[i]);
  //      }
        printArray(myIntArray);
        //System.out.println(myIntArray[0]);
    }
    public  static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println("Element "+i+", value is "+array[i]);

        }
    }*/
        int[] myIntegers = getInegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }
    public static  int[] getInegers(int numbers){
        System.out.println("Enter "+numbers+" integers values.\r");
        int[] values=new int[numbers];
        for (int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int [] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (double)sum/(double)array.length;
    }
}
