package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer=new Customer("Tim",76.90);
        Customer anothercustomer;
        anothercustomer=customer;
        anothercustomer.setBalance(67.90);
        System.out.println("Balance for customer"+customer.getName()+" is "+customer.getBalance());

        ArrayList<Integer> intList=new ArrayList<Integer>();
        intList.add(2);
        intList.add(3);
        intList.add(4);

        for (int i=0;i<intList.size();i++){
            System.out.println(i+": "+intList.get(i));
        }
        intList.add(2,6);

        for (int i=0;i<intList.size();i++){
            System.out.println(i+": "+intList.get(i));
        }
    }
}
