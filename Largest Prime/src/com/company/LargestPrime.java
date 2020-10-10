package com.company;

public class LargestPrime { 
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        for (int d = number - 1; d > 1; d--) {
            if (number % d == 0) {
                number = d;
            }
        }
        return number;
    }
}

