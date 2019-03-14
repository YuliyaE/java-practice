package by.yuliya.java.classes.book.entity;

public class BookSearch {

    private static Book[] addBook() {
        Book[] books = new Book[5];
        books[0] = new Book("War and peace", "Azbuka", 2018, 308, 15.81, "hard");
        books[0].setAuthors("Tolstoy");
        books[1] = new Book("Mysterious Island", "Azbuka", 2015, 768, 9.44, "hard");
        books[1].setAuthors("Verne");
        books[2] = new Book("Triumphal arch", "AST", 2016, 415, 18.24, "soft");
        books[2].setAuthors("Remark");
        books[3] = new Book("Jane Eyre", "AST", 2013, 592, 9.44, "soft");
        books[3].setAuthors("Bronte");
        books[4] = new Book("Crime and Punishment", "Druk", 2012, 574, 8.36, "hard");
        books[4].setAuthors("Dostoevsky");
        return books;
    }


    private static void getBooksByAuthor(Book[] books, String author) {
        System.out.println("The books by " + author + ":");
        for (Book book : books) {
            for (String authorName : book.getAuthors()) {
                if (authorName.equalsIgnoreCase(author)) {
                    System.out.println(book);
                }
            }
        }
    }

    private static void getBooksByPublishingHouse(Book[] books, String publishingHouse) {
        System.out.println("The books by publishing house " + publishingHouse + ":");
        for (Book book : books) {
            if (book.getPublishingHouse().equalsIgnoreCase(publishingHouse)) {
                System.out.println(book);
            }
        }
    }


    private static void getBooksPublishedAfterThisYear(Book[] books, int publishingYear) {
        System.out.println("The books published after " + publishingYear + " year:");
        for (Book book : books) {
            if (book.getPublishingYear() > publishingYear) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        getBooksByAuthor(addBook(), "Tolstoy");
        getBooksByPublishingHouse(addBook(), "AST");
        getBooksPublishedAfterThisYear(addBook(), 2016);
    }

}
