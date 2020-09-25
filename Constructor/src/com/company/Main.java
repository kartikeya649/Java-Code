package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
   /*       Account myAccount=new Account();//("7990",0.00,"Tillu","tilllu@kaluu.com","82793379379");
        System.out.println(myAccount.getNumber());
        System.out.println(myAccount.getBalance());

      Account myAccount=new Account();

        myAccount.setNumber("47949");
        myAccount.setCustomerName("Tillu");
        myAccount.setCustomerEmailAddress("tillu@kalu.com");
        myAccount.setCustomerPhoneNumber("98982330332");


        myAccount.withdrawal(234.0);

        myAccount.deposit(090.0);
        myAccount.withdrawal(2768.0);

        myAccount.deposit(9889.0);
        myAccount.withdrawal(9879879.0);
*/
        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
