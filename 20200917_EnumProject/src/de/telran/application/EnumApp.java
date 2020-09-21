package de.telran.application;

import de.telran.data.DayOfWeek;
import de.telran.data.Schedule;
import de.telran.data.WeekDay;

import java.util.Arrays;

public class EnumApp {

    public static void main(String[] args) {

        WeekDay weekDay = WeekDay.MONDAY;

        //System.out.println(weekDay);

        DayOfWeek monday = DayOfWeek.MONDAY;
        System.out.println(DayOfWeek.FRIDAY.ordinal());
        System.out.println(Arrays.toString(DayOfWeek.values()));
        System.out.println(monday.getTitle());
        System.out.println(DayOfWeek.FRIDAY.getTitle());
        DayOfWeek.FRIDAY.sayHello();

        Schedule schedule = new Schedule();
        schedule.wakeUp(DayOfWeek.FRIDAY);
        schedule.getMenu(DayOfWeek.MONDAY);
        System.out.println();
        schedule.displayWeekMenu();



    }



}
