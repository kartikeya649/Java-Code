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
                case 6:
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
        int itemNo=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem=scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1,newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }

    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem=scanner.nextLine();
        if (groceryList.findItem(searchItem)!=null){
            System.out.println("Found "+searchItem+" in our grocery list");
        }else {
            System.out.println(searchItem+" isn't in the shopping list");
        }
    }



}
