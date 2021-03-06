package de.telran.data;

public interface Colorable {

    Color getColor();

        class Color{
        private int red, green, blue;

        public Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        public int getRed() {
            return red;
        }

        public int getGreen() {
            return green;
        }

        public int getBlue() {
            return blue;
        }
    }
}

class Triangle implements Colorable{

    private Color color;

    @Override
    public Color getColor() {
        return color;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println(t.getColor());

        t.color = new Colorable.Color(34,100, 120);

    }
}
