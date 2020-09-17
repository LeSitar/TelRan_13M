package de.telran.data;

public class WeekDay {

    private String titleOfDay;

    private WeekDay (String titleOfDay){
        this.titleOfDay = titleOfDay;
    }

    public final static WeekDay MONDAY = new WeekDay("monday");
    public final static WeekDay TUESDAY = new WeekDay("tuesday");


    @Override
    public String toString() {
        return "WeekDay{" +
                "titleOfDay='" + titleOfDay + '\'' +
                '}';
    }


}
