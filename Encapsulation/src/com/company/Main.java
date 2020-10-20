package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Player player=new Player();
        player.name="Kartik";
        //player.health=20;
        player.weapon="Sword";

        int damage=10;
        player.loseHealth(damage);
        System.out.println("Remaining Health: "+player.healthRemaining());

        damage=11;
        player.health=200;
        player.loseHealth(damage);
        System.out.println("Remaining Health: "+player.healthRemaining());*/
        EnhancedPlayer player=new EnhancedPlayer("Kartik",89,"Sword");
        System.out.println("Initial health is: "+player.getHealth());
        System.out.println("################################Challange######################################");

        Printer printer=new Printer(50,true);
        System.out.println("Initial page count: "+printer.getPagesPrinted());
        int pagesPrinted=printer.printPages(4);
        System.out.println("Pages printed was "+pagesPrinted+" New total print count for printer: "+printer.getPagesPrinted());
    }
}
