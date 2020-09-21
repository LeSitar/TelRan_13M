package de.telran.data;

public class Schedule {

    //private DayOfWeek dayOfWeek;
    private DayOfWeek[] week;

    public Schedule() {
        //this.dayOfWeek = dayOfWeek;
        this.week = DayOfWeek.values();
    }

    /*public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }*/


    public DayOfWeek[] getWeek() {
        return week;
    }


    public void wakeUp(DayOfWeek dayOfWeek){
        if(dayOfWeek.ordinal()>4){  // if(dayOfWeek.ordinal()>4)
            System.out.println("you can sleep longer");
        }
        else{
            System.out.println("wake up!");
        }
    }

    public void getMenu(DayOfWeek dayOfWeek){
        switch (dayOfWeek){
            case MONDAY:
                System.out.println("Spaghetti");
                break;
            case WEDNESDAY:
                System.out.println("Chicken");
                break;
            case TUESDAY:
                System.out.println(("Pizza"));
                break;
            case THURSDAY:
                System.out.println("Fish chips");
                break;
            case FRIDAY:
                System.out.println("Burger");
                break;
            case SATURDAY:
                System.out.println("Olivie");
                break;
            case SUNDAY:
                System.out.println("Borsch");
                break;
        }
    }

    public void displayWeekMenu(){
        for (DayOfWeek day:week) {
            getMenu(day);
        }
    }


}
