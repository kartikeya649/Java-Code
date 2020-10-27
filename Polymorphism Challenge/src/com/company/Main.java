package com.company;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders,String name){
        this.cylinders=cylinders;
        this.name=name;
        this.engine=true;
        this.wheels=4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car -->> startEngine()";
    }
    public String accelerate(){
        return "Car -->> accelerate()";
    }
    public String brake(){
        return "Car -->> brake()";
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders,String name){
        super(cylinders,name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -->> StartEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -->> Accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -->> Brake()";
    }
}

class ford extends Car{
    public ford(int cylinders,String name){
        super(cylinders,name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+" -->> StartEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+" -->> Accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+" -->> Brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car=new Car(8,"Baase Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi=new Mitsubishi(6,"Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        ford Ford=new ford(6,"Outlander VRW 4WD");
        System.out.println(Ford.startEngine());
        System.out.println(Ford.accelerate());
        System.out.println(Ford.brake());
    }
}
