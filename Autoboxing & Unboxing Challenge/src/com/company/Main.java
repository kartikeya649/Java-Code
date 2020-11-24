package com.company;

public class Main {

    public static void main(String[] args) {
		    // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions
        Bank bank=new Bank("Kartikeya Bank of India");
        if (bank.addBranch("Gola")){
            System.out.println("Gola branch created");
        }

        bank.addCustomer("Gola","Billu",90.90);
        bank.addCustomer("Gola","Tilllu",190.90);
        bank.addCustomer("Gola","Billuaaaaa",290.90);

        bank.addBranch(" Greater Noida");
        bank.addCustomer(" Greater Noida","Billu",23290.90);

        bank.addCustomerTransaction("Gola","Billu",8080.08);
        bank.addCustomerTransaction("Gola","Tilllu",80830.08);
        bank.addCustomerTransaction("Gola","Billuaaaaa",808033.08);

        bank.listCustomers("Gola",true);
        bank.listCustomers("Greater Noida",true);

        bank.addBranch("Noida");

        if (!bank.addCustomer("Noida","Billu",97980.0)){
            System.out.println("Error Noida branch doesn't exists");
        }

        if (!bank.addBranch("Gola")){
            System.out.println("Gola branch already exists");
        }

        if (!bank.addCustomer("Gola","Billu Bail",973980.0)){
            System.out.println("Customer doesn't exists in this branch ");
        }

        if (!bank.addCustomer("Gola","Billu",973980.0)){
            System.out.println("Customer Billu exists in this branch ");
        }




    }
}
