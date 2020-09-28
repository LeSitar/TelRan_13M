package de.telran.data;

import java.util.Scanner;

public class UserAdmin extends User {
    private String password;

    public UserAdmin(String userName, int age, String password) {
        super(userName, age);
        this.password = password;
    }

    public boolean checkPassword(Scanner scanner){
                int count = 3;
                while(count>0){
                    System.out.println("enter password, please");
                    String password = scanner.nextLine();
                    if(this.password.equals(password))
                        return true;
                    else count--;
                }
        return false;
    }
}
