package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account myAccount=new Account();//("7990",0.00,"Tillu","tilllu@kaluu.com","82793379379");
        System.out.println(myAccount.getNumber());
        System.out.println(myAccount.getBalance());
        /*Account myAccount=new Account();

        myAccount.setNumber("47949");
        myAccount.setCustomerName("Tillu");
        myAccount.setCustomerEmailAddress("tillu@kalu.com");
        myAccount.setCustomerPhoneNumber("98982330332");
*/
        myAccount.withdrawal(234.0);

        myAccount.deposit(090.0);
        myAccount.withdrawal(2768.0);

        myAccount.deposit(9889.0);
        myAccount.withdrawal(9879879.0);
    }
}
