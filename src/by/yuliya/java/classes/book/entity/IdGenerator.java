package by.yuliya.java.classes.book.entity;

public class IdGenerator {

    private static final long MIN_ID = 1;
    private static final long MAX_ID = 100000;
    private static long counter;

    public static long generateId() {
        ++counter;
        if (MIN_ID + counter >= MAX_ID) {
            counter = 0;
        }
        long id = counter;
        return id;
    }

    public static void setId(long id) {
        counter = id;
    }

}
