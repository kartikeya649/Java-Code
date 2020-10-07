package com.company;

public class FactorPrinter {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int factors = 0;
        while (factors < number) {
            factors++;
            if (number % factors == 0) {
                System.out.println(factors);
            }
        }
    }
}