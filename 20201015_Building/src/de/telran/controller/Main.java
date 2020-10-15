package de.telran.controller;

import de.telran.data.Building;
import de.telran.data.Cinema;
import de.telran.data.Office;

public class Main {
    public static void main(String[] args) {
        Building building = new Building.Shop("Krummestrasse");
        System.out.println(building.getType());
        System.out.println(building.toString());

        Building.Cafe cafe = new Building.Cafe("Kudamm");

        Building building1 = new Cinema("Uliza");
        Cinema cinema = new Cinema("Uliza");

        Office office = new Office();
        Office.Address address = office.new Address("Street", 10);

        Office.Address address1 = office.new Address("Street", 12) {
            @Override
            public String toString() {
                return "Clinic is moved";
            }
        };

        // final int number = 10;
        // effectively

        final int a = 1;
        int b;
        if(a==2) b=3;
        else b=4;


        int c = 10;
        c++;

        /*final int[] array = {1,2,3,4,5};
        array[3] = 6;

        array = new int[7];*/


    }
}
