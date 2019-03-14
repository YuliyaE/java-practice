package by.yuliya.java.fundamentals.datatypes;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuestOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter amount of numbers");

        try {
            int enteredNumber = scanner.nextInt();
            int arrayOfNumbers[] = new int[enteredNumber];
            int lengthsOfNumbers[] = new int[enteredNumber];

            System.out.println("Enter " + enteredNumber + " numbers: ");
            for (int i = 0; i < enteredNumber; i++) {
                arrayOfNumbers[i] = scanner.nextInt();
                lengthsOfNumbers[i] = (Integer.toString(arrayOfNumbers[i])).length();
            }
            findMaxAmdMinLengthOfNumbers(arrayOfNumbers, lengthsOfNumbers);
            sortArrayOfNumbers(arrayOfNumbers);
            findAverageLength(arrayOfNumbers, lengthsOfNumbers);
            findIncreasingNumberSequence(arrayOfNumbers);
            findEvenNumbers(arrayOfNumbers, lengthsOfNumbers);
            findPalindrome(arrayOfNumbers);

        } catch (InputMismatchException e) {
           e.printStackTrace();
        } finally {
            scanner.close();
        }

    }


    private static void findMaxAmdMinLengthOfNumbers(int[] arrayOfNumbers, int[] lengthsOfNumbers) {
        int maxLength = lengthsOfNumbers[0];
        int minLength = lengthsOfNumbers[0];
        int indexOfLongNumber = 0;
        int indexOfShortNumber = 0;
        for (int i = 1; i < arrayOfNumbers.length; i++) {
            int j = lengthsOfNumbers[i];
            if (minLength > j) {
                minLength = j;
                indexOfShortNumber = i;
            }
            if (maxLength < j) {
                maxLength = j;
                indexOfLongNumber = i;
            }
        }
        System.out.println("The shortest number: " + arrayOfNumbers[indexOfShortNumber] + "." + " length: " + minLength + ";");
        System.out.println("The longest number: " + arrayOfNumbers[indexOfLongNumber] + "." + " length: " + maxLength + ";");
        System.out.println();
    }

    private static void sortArrayOfNumbers(int[] arrayOfNumbers) {
        for (int i = arrayOfNumbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayOfNumbers[j] > arrayOfNumbers[j + 1]) {
                    int lowerNumber = arrayOfNumbers[j];
                    arrayOfNumbers[j] = arrayOfNumbers[j + 1];
                    arrayOfNumbers[j + 1] = lowerNumber;
                }
            }
        }
        System.out.println(Arrays.toString(arrayOfNumbers));
    }

    private static void findAverageLength(int[] arrayOfNumbers, int[] lengthsOfNumbers) {
        int sum = 0;
        double averageValue;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            sum = sum + lengthsOfNumbers[i];
        }
        averageValue = sum / arrayOfNumbers.length;
        System.out.println();
        System.out.println("The numbers, which length less then average: ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (averageValue > lengthsOfNumbers[i]) {
                System.out.println(arrayOfNumbers[i] + " length: " + lengthsOfNumbers[i]);
            }
        }

    }

    private static void findIncreasingNumberSequence(int[] arrayOfNumbers) {
        boolean sequenceStatus = false;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            int number;
            int figure = arrayOfNumbers[i];
            while (figure != 0) {
                number = figure % 10;
                figure = figure / 10;
                if (number > figure % 10) {
                    sequenceStatus = true;
                } else {
                    break;
                }
            }
            if (sequenceStatus) {
                System.out.println("The numbers in right order: " + arrayOfNumbers[i]);
                break;
            }
        }
    }

    private static void findEvenNumbers(int[] arrayOfNumbers, int[] lengthsOfNumbers) {
        boolean condition;
        int quantity = arrayOfNumbers.length;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            condition = true;
            int element = arrayOfNumbers[i];
            int elementSize = lengthsOfNumbers[i];
            for (int j = 1; j <= elementSize; j++) {
                if (element % 2 == 0) {
                    element = element / 10;
                } else {
                    --quantity;
                    condition = false;
                    break;
                }
            }
            if (condition) {
                System.out.println("The numbers with even digits: " + arrayOfNumbers[i]);
            }
        }
        System.out.println("The quantity of the numbers with even digits " + quantity);
    }

    private static void findPalindrome(int[] arrayOfNumbers) {
        boolean existence = false;
        String[] array = new String[arrayOfNumbers.length];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            array[i] = Integer.toString(arrayOfNumbers[i]);
        }
        for (int i = 0; i < array.length; i++) {
            String reverseNumber = new StringBuffer(array[i]).reverse().toString();
            if (Integer.toString(arrayOfNumbers[i]).equals(reverseNumber)) {
                existence = true;
                System.out.println("Palindrome is " + arrayOfNumbers[i]);
            }
        }
        if (!existence) {
            System.out.println("There is not any palindromes");
        }
    }

}