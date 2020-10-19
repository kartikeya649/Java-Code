package com.company;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimension dimension=new Dimension(20,20,5);
        Case theCase=new Case("220H","MSI","260",dimension);

        Monitor theMonitor=new Monitor("160inch","MSI",160,new Resolution(2809,2900));

        Motherboard theMotheboard=new Motherboard("BH-90","ASUS",8,9,"v9.0");

        PC thePC=new PC(theCase,theMonitor,theMotheboard);
        thePC.powerUp();

        System.out.println("#######################Challange Part########################");

        Wall wall1=new Wall("East");
        Wall wall2=new Wall("West");
        Wall wall3=new Wall("South");
        Wall wall4=new Wall("North");

        Ceiling ceiling=new Ceiling(12,34);

        Bed bed=new Bed("Fantastic",4,5,6,2);

        Lamp lamp=new Lamp("Modern",false,67);

        Bedroom bedroom=new Bedroom("Kartik",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
