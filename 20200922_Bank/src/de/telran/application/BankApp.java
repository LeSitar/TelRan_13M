package de.telran.application;

import de.telran.dao.Bank;
import de.telran.data.BankAccount;
import de.telran.data.Person;
import de.telran.data.Sex;

import java.util.Date;

public class BankApp {

    public static void main(String[] args) {

        Person client1 = new Person("Ivan", "Ivanov", 1978,"Moscow", Sex.MALE);
        Person client2 = new Person("Masha", "Mashina", 1972,"Berlin", Sex.FEMALE);

        BankAccount account1 = new BankAccount(client1, 2000);
        BankAccount account2 = new BankAccount(client2, 500);

        Bank myBank = new Bank(100);

        myBank.addAccount(account1);
        myBank.addAccount(account2);

        myBank.displayAccounts();

        myBank.transferMoney(10100001, 10100002, 200);

        myBank.transferMoney(10100002, 10100001, 1000);






    }

}
