package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    private static GroceryList groceryList=new GroceryList();

    public static void main(String[] args) {
	// write your code here
        boolean quit=false;
        int choice=0;
        printInstruction();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    searchForItem();
                    break;
                case 5:
                    modifyitem();
                    break;
		case6:
		      processArrayList();
		      
                case 7:
                    quit=true;
                    break;
            }
        }
    }

    public static void printInstruction(){
        System.out.println("\n Press ");
        System.out.println("\t 0- To print choice options.");
        System.out.println("\t 1- To print the list of the grocery items.");
        System.out.println("\t 2- To add an item in to the list.");
        System.out.println("\t 3- To remove an item in to the list.");
        System.out.println("\t 4- To search an item in to the list.");
        System.out.println("\t 5- To modify an item in to the list.");
        System.out.println("\t 6- To quit the application.");
    }
    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyitem(){
        System.out.print("Enter item number: ");
        String itemNo=scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem=scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo,newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        String itemNo = scanner.nextLine();

        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem(){
        System.out.print("Item to search for: ");
        String searchItem=scanner.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("Found "+searchItem);
        }else {
            System.out.println(searchItem+", not on file");
        }
    }
    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);


    }


}
