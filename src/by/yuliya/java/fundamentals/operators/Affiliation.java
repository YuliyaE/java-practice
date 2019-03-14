package by.yuliya.java.fundamentals.operators;

import java.util.Scanner;

public class Affiliation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter k value");
        int number = scanner.nextInt();
        int lowerIntervalValue = scanner.nextInt();
        int upperIntervalValue = scanner.nextInt();
        if (isInterval(lowerIntervalValue, upperIntervalValue)) {
            String interval = defineInterval(lowerIntervalValue, upperIntervalValue, number);
            System.out.println(number + " belongs to " + interval);
        }
        scanner.close();

    }

    private static boolean isInterval(int lowerIntervalValue, int upperIntervalValue) {
        if (lowerIntervalValue <= upperIntervalValue) {
            return true;
        } else {
            throw new IllegalArgumentException("It is not an interval. Upper part of interval should be greater than lower one");
        }
    }

    private static String defineInterval(int lower, int upper, int number) {
        if ((number > lower) && (number < upper)) {
            return "(" + lower + "," + upper + "), " + "[" + lower + "," + upper + "), [" + lower + "," + upper + "]," + "(" + lower + "," + upper + "]";
        } else if (number == lower) {
            return "[" + lower + "," + upper + "), [" + lower + "," + upper + "]";
        } else if (number == upper) {
            return "(" + lower + "," + upper + "], [" + lower + "," + upper + "]";
        } else {
            return "The number is outside the interval;";
        }
    }


}
