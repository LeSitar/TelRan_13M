package de.telran.airplane;

public class Main {
    public static void main(String[] args) {

        System.out.println(Boeing737.Drawing.getCapacity());

        Boeing737.Drawing drawing = new Boeing737.Drawing(1);

        System.out.println(Boeing737.Drawing.Author.author);



       // System.out.println(drawing.toString());

        for (int i = 0; i <5 ; i++) {
            Boeing737.Drawing drawing1 = new Boeing737.Drawing(i);
            System.out.println(drawing1);
        }
    }

}
