package de.telran;

public class ProgramsLodger {
    private static ProgramsLodger programsLodger;
    private static String logFile;

    private ProgramsLodger() {
        logFile = "this is log file\n";
    }

    public static ProgramsLodger getInstance(){
        if(programsLodger ==null){
            programsLodger = new ProgramsLodger();
        }
        return programsLodger;
    }

    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }

}
