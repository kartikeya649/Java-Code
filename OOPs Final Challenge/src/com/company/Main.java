package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger=new Hamburger("Basic","Sausage",4.44,"White");
        double price=hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.89);
        hamburger.addHamburgerAddition2("Lettuce",9.0);
        hamburger.addHamburgerAddition3("Chesse",.98);
        System.out.println("Total Burger price is: "+hamburger.itemizeHamburger());

        HealthyBurger healthyBurger=new HealthyBurger("Bacon",89.0);
        healthyBurger.addHealthAddition1("Egg",9);
        healthyBurger.addHealthAddition2("Meat",45);
        System.out.println("Total Healthy burger price is: "+healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger=new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("Shouldn't do this",89.88);
        deluxeBurger.itemizeHamburger();
    }
}
