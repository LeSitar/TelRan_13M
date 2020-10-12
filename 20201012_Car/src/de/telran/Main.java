package de.telran;

import de.telran.Car.SteeringWheel;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("opel", 2012);
        SteeringWheel steeringWheel = car.new SteeringWheel();
        //Car.Headlight headlight = car.new Headlight();

        //headlight.lightOn();
        car.start();
        steeringWheel.left();
        steeringWheel.right();
        car.stop();
        car.headlight.lightOn();
        car.steeringWheel.left();


    }

}
