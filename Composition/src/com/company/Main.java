package com.company;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimension dimension=new Dimension(20,20,5);
        Case theCase=new Case("220H","MSI","260",dimension);

        Monitor theMonitor=new Monitor("160inch","MSI",160,new Resolution(2809,2900));

        Motherboard theMotheboard=new Motherboard("BH-90","ASUS",8,9,"v9.0");

        PC thePC=new PC(theCase,theMonitor,theMotheboard);
        thePC.getMonitor().drawPixelAt(1500,1200,"red");
        thePC.getMotherboard().loadProgram("Windows 10");
        thePC.getTheCase().pressPowerButton();
    }
}
