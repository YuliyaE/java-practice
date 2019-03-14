package by.yuliya.java.exception;

public class HandlingArithmeticException {

    public void count() {
        int value = 0;
        try {
            int randomNumber = (int)(Math.random() * 3);
             value = 8 / randomNumber;
        } catch(ArithmeticException e) {
            System.err.println("division by zero" + e);
        }
        System.out.println(value);
    }

}
