package de.telran;

public class User {
    private String userName;
    private final int userId;   //
    private static int usersNumber = 0;   //

    public User(String userName){
        this.userName = userName;
        userId = ++usersNumber;
    }

    public String getUserName(){
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        if(userId>=10){
            return "0" + userId + ". " + userName;
        }
        return "00" + userId + ". " + userName;
    }



    public static void main(String[] args) {
        User user1 = new User("Vasya");
        System.out.println(user1);

        User user2 = new User ("Petya");
        System.out.println(user2);

        User user3 = new User ("Masha");
        User user4 = new User("Katya");
        User user5 = new User("Katya");
        User user6 = new User("Katya");
        User user7 = new User("Katya");
        User user8 = new User("Katya");
        User user9 = new User("Katya");
        User user10 = new User("Katya");
        User user11 = new User("Katya");

        System.out.println(user3);
        System.out.println(user1);
        System.out.println(user10);


        //user1.getUsersNumber();




    }
}
