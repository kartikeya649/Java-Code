package com.company;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes<0){
            System.out.println("Invalid Value");
            return;
        }
        int minutesPerHour=60;
        int hourPerDay=24;
        int daysPerYear=365;
        int minutesPerDay=60*24;
        int minutesPerYear=365*minutesPerDay;

        long resultYears = minutes / minutesPerYear;
        long remainingMinutesAfterYears = minutes % minutesPerYear;

        long resultDays = remainingMinutesAfterYears / minutesPerDay;

        System.out.println(minutes +" min = " + resultYears + " y and " + resultDays +" d");
    }
}
