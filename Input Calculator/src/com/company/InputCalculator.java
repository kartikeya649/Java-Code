package com.company;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0,  number, counter = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                sum += number;
                counter ++;
            } else {
                break;
            }
        }
        long avg = Math.round((double) sum / (double) counter);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
