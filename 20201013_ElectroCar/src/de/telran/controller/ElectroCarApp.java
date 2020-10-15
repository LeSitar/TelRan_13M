package de.telran.controller;

import de.telran.data.ElectroCar;

public class ElectroCarApp {
    public static void main(String[] args) {
        ElectroCar car = new ElectroCar(10);
        car.start();
        System.out.println(car.getReports()[0]);

        ElectroCar.Battery battery = new ElectroCar.Battery();
        //Motor motor = new Motor();

        ElectroCar.Motor motor =  car.new Motor();

        ElectroCar car2 = new ElectroCar(5){
            @Override
            public void start() {
                System.out.println("i' m going");
            }
        };
        System.out.println();
        car2.start();

        ElectroCar car3 = new ElectroCar(3){
            @Override
            public void start() {
                super.start();
            }
        };

    }
}
