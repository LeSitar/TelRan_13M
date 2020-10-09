package de.telran.airplane;

public class Boeing737 {
    private int manufactureYear;
    private static int maxPassengerCount = 300;

    public Boeing737(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public static class Drawing{

        static class Author{
            public static String author = "Smit";
        }

        private int id;

        public Drawing(int id) {
            this.id = id;
        }

        public static int getCapacity(){
            return maxPassengerCount;
        }

        @Override
        public String toString() {
            return "Drawing{" +
                    "id=" + id +
                    '}';
        }
    }
}
