package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int switchValue=1;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a "+switchValue);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }
        char charValue='A';
        switch (charValue){
            case 'A':
                System.out.println("A is found");
                break;
            case 'B':
                System.out.println("B is found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue+" is found");
                break;
            default:
                System.out.println("Couldn't find any value");
                break;
        }
        String month="July";
        switch (month.toLowerCase()){
            case "june":
                System.out.println("June");
                break;
            case "july":
                System.out.println("July");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }
    }
}
