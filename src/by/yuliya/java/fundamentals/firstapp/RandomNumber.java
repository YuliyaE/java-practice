package by.yuliya.java.fundamentals.firstapp;

import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter amount of numbers");
        int arraySize = scanner.nextInt();

        int array[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            int randomNumber = (int) (Math.random() * 10);
            array[i] = randomNumber;
        }

        System.out.println("each number on a new line:");
        for (int j : array) {
            System.out.println(j);
        }
        System.out.print("all numbers on one line: ");
        for (int k : array) {
            System.out.print(k);
        }

        scanner.close();

    }
}
