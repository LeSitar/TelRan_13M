package de.telran;

public class DataValidator {

    public static boolean dateValidator(int year, int month, int day){

        return isYearCorrect(year)&&isMonthCorrect(month)&&
                isDayCorrect(year,month,day);
    }

    private static boolean isYearCorrect(int year){

        return year>=1;  // if(year>=1) return true;

    }

    private static boolean isMonthCorrect(int month){

        return month>=1&&month<=12;
    }

    private static boolean isYearLeap(int year){
        return (year%400==0 || year%4==0&&year%100!=0);
    }

    private static int getDayPerMonth(int month, int year){
        if(month==4 || month==6|| month==9|| month==11)
            return 30;
        if(month==2)
            return 28 + addDayIfYearLeap(year);
        return 31;
    }

    private static int addDayIfYearLeap(int year) {
        return isYearLeap(year) ? 1:0;
    }

    private static boolean isDayCorrect(int year, int month, int day){
        if(day>=1&&day<=28)
            return true;
        return day>28&&day<=getDayPerMonth(month,year);
    }
}
