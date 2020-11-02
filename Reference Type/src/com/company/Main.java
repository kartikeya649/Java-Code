package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue=10;
        int anotherintValue=myIntValue;

        System.out.println("MyIntValue: "+myIntValue);
        System.out.println("AnotherIntValue: "+anotherintValue);

        anotherintValue++;

        System.out.println("MyIntValue: "+myIntValue);
        System.out.println("AnotherIntValue: "+anotherintValue);

        int[] myIntArray=new int[5];
        int[] anotherArray=myIntArray;

        System.out.println("MyIntValue: "+ Arrays.toString(myIntArray));
        System.out.println("AnotherIntValue: "+Arrays.toString(anotherArray));

        anotherArray[0]=1;

        System.out.println("After Change MyIntValue: "+ Arrays.toString(myIntArray));
        System.out.println("After Change AnotherIntValue: "+Arrays.toString(anotherArray));

        anotherArray=new int[]{4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("After Modify MyIntValue: "+ Arrays.toString(myIntArray));
        System.out.println("After Modify AnotherIntValue: "+Arrays.toString(anotherArray));



    }
    private static void modifyArray(int[] array){
        array[0]=2;
        array=new int[]{1,2,3,4,5};
    }
}
