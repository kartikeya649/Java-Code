package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString="2018.125";
        System.out.println("Number As String: "+numberAsString);

        double number=Double.parseDouble(numberAsString);
        System.out.println("Number :"+number);

        numberAsString+=1;
        number+=1;
        System.out.println("Number As String: "+numberAsString);
        System.out.println("Number: "+number);
    }
}
