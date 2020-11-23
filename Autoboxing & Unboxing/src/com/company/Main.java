package com.company;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue){
        this.myValue=myValue;
    }
    public int getMyValue(){
        return myValue;
    }
    public void setMyValue(int myValue){
        this.myValue=myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] strArray=new String[10];
        int[] intArray=new int[10];

        ArrayList<String> strArrayList=new ArrayList<>();
        strArrayList.add("Kartik");

        ArrayList<IntClass> intClassArrayList=new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer=new Integer(54);
        Double doubleValue=new Double(12.32);

        ArrayList<Integer> intArrayList=new ArrayList<Integer>();
        /*for (int i=0;i<=10;i++){
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i=0;i<=10;i++){
            System.out.println(i+" --->> "+intArrayList.get(i).intValue());
        }*/
        Integer myIntValue=78;
        int myInt=myIntValue.intValue();

        ArrayList<Double> myDoubleValues=new ArrayList<Double>();
        for (double dbl=0;dbl<=10.0;dbl+=0.5){
            myDoubleValues.add(dbl);
        }
        for (int i=0;i<myDoubleValues.size();i++){
            double value=myDoubleValues.get(i);
            System.out.println(i+"  ---------->>>>     "+value);
        }
    }
}
