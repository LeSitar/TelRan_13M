package de.telran;

public class Test {
    private final int ID_NUMBER;
    private static int idNumber=0;

    public Test(int ID_NUMBER) {
        this.ID_NUMBER = ID_NUMBER;
    }

   /* public int getID_NUMBER() {
        return ID_NUMBER;
    }*/

    public Test() {
        idNumber++;
        ID_NUMBER = 20;
    }

    public static int getIdNumber() {
        return idNumber;
    }

    public static void setIdNumber(int idNumber) {
        Test.idNumber = idNumber;
    }

    public static void main(String[] args) {

        Test t5 = new Test(55);
        Test t6 = new Test();


        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        Test t4 = new Test();

        System.out.println(t1.ID_NUMBER);

        System.out.println(t1.ID_NUMBER);

        System.out.println(Test.getIdNumber());

        System.out.println(t6.ID_NUMBER);
        System.out.println(t5.ID_NUMBER);

        System.out.println(Test.getIdNumber());


        // class User; String name; int id; User user = new User("Vasya"); -> Vasya, 001
        //User user = new("Petya") -> Petya, 002;
        //User user = new User();
        //






    }
}
