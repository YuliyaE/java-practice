package by.yuliya.java.fundamentals.operators;

import java.text.DateFormatSymbols;
import java.util.Scanner;

public class NumberOfMonth {

    private static boolean isMonth(int monthNumber) {
        return monthNumber > 0 && monthNumber <= 12;
    }

    private static String getMonthName(int monthNumber) {
        if (!isMonth(monthNumber)) {
            throw new IllegalArgumentException("Incorrect number of month");
        }
        return new DateFormatSymbols().getMonths()[monthNumber - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month");
        System.out.println(getMonthName(scanner.nextInt()));
        scanner.close();
    }


}


