package com.driver;
public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
//
        Car car = new Car("Tata", 4, 4, 4, true, "Sedan");
        System.out.println(car.getName());
//        assert car.getName() == "Tata";
        System.out.println(car.getDoors());

//        assert car.getDoors() == 4;
        System.out.println(car.getGears());

//        assert car.getGears() == 4;
        System.out.println(car.getWheels());

//        assert car.getWheels() == 4;
        System.out.println(car.isManual());

//        assert car.isManual();
        System.out.println(car.getType() );

//        assert car.getType() == "Sedan";
        System.out.println(car.getCurrentGear());

//        assert car.getCurrentGear() == 1;
        System.out.println();

        car.changeSpeed(20, 30);
        System.out.println(car.getCurrentSpeed());

//        assert car.getCurrentSpeed() == 20;
        System.out.println(car.getCurrentDirection());

//        assert car.getCurrentDirection() == 30;
        System.out.println();

        car.changeGear(3);
        System.out.println(car.getCurrentGear());

//        assert car.getCurrentGear() == 3;


    }
}