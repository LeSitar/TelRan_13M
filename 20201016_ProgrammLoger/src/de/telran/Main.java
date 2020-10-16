package de.telran;

public class Main {
    public static void main(String[] args) {
        System.out.println(ProgramsLodger.getInstance());
        System.out.println(ProgramsLodger.getInstance());
        System.out.println(ProgramsLodger.getInstance());

        ProgramsLodger.getInstance().showLogFile();
        ProgramsLodger.getInstance().addLogInfo("log one ...");
        ProgramsLodger.getInstance().addLogInfo("log two ...");
        ProgramsLodger.getInstance().showLogFile();
    }
}
