package de.telran.controller;

import de.telran.data.*;

public class PrintableApp {

    public static void main(String[] args) {

        Book book = new Book("The little prince", "Saint-Exupery");
        Printable book2 = new Book("War and Peace", "Tolstoy");
        Printable journal = new Journal("World");
        Printable newspaper = new Newspaper();
        WaterPipe pipe = new WaterPipe();

        Printable[] printableObjects = {book, book2, journal, newspaper, pipe};

        Lamp lamp = new Lamp();

        lamp.printState(0);
        pipe.printState(1);

        /*for (Printable p: printableObjects) {
            p.print();
        }*/

       book.print2("i'm book");
       newspaper.print2("Morgen Post");

       Printable print = new Printable() {
           @Override
           public void print() {
               System.out.println("i'm printer");
           }
       };

       print.print();




        Printable.print1();
        Printable p = Printable.createObject("Peace", 2);


        p.print();
    }

}
