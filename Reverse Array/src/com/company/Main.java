package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] array={1,4,6,7,8,9,24,55,6,77,88};
        System.out.println("Array: "+ Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed Array: "+Arrays.toString(array));
    }
    private static void reverse(int[] array){
        int maxIndex= array.length-1;
        int halfLength= array.length/2;
        for (int i=0;i<halfLength;i++){
            int temp=array[i];
            array[i]=array[maxIndex-i];
            array[maxIndex-i]=temp;
        }
    }
}
