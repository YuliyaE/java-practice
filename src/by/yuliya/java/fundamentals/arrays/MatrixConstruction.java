package by.yuliya.java.fundamentals.arrays;

import java.util.*;

public class MatrixConstruction {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter matrix size");
        int size = Integer.parseInt(scan.nextLine());
        Integer[][] matrix = new Integer[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\t");
        }

        sortMatrix(matrix);
        moveToRight(matrix);

    }

    private static void writeMatrix(Integer[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }

    private static void sortMatrix(Integer[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of column to sort matrix");
        try {
            final int columnNumber = Integer.parseInt(scanner.nextLine());
            List<Integer[]> matrixList = Arrays.asList(matrix);
            Collections.sort(matrixList, new Comparator<Integer[]>() {
                public int compare(Integer[] o1, Integer[] o2) {
                    return o1[columnNumber - 1] - o2[columnNumber - 1];
                }
            });
            System.err.println("sorting values of " + columnNumber + " column");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException" + e);
        } catch (NumberFormatException e) {
            System.err.println("Number format exception" + e);
        } finally {
            writeMatrix(matrix);
        }
    }


    private static void moveToRight(Integer[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of steps to move matrix");
        try {
            int numberOfSteps = scanner.nextInt();
            if (numberOfSteps > matrix.length || numberOfSteps < 1) {
                System.out.println("The shift is impossible");
            }
            for (int step = 0; step < numberOfSteps; step++) {
                int temp;
                int j;
                for (int i = 0; i < matrix.length; i++) {
                    temp = matrix[i][matrix.length - 1];
                    for (j = matrix.length - 1; j > 0; j--) {
                        matrix[i][j] = matrix[i][j - 1];
                    }
                    matrix[i][j] = temp;
                }
            }
            writeMatrix(matrix);
        } catch (InputMismatchException e) {
            System.err.println("Number format exception" + e);
        }
    }

}
