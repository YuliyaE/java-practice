package by.yuliya.java.classes.book.entity;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private long id;
    private String name;
    private List<String> authors = new ArrayList<String>();
    private String publishingHouse;
    private int publishingYear;
    private int pagesNumber;
    private double price;
    private String bindingType;

    public Book(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Book(long id, String name, List<String> authors) {
        this.id = id;
        this.name = name;
        this.authors = authors;
    }

    public Book(String name, String publishingHouse, int publishingYear, int pagesNumber, double price, String bindingType) {
        this.id = IdGenerator.generateId();
        this.name = name;
        this.authors = new ArrayList<String>();
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.pagesNumber = pagesNumber;
        this.price = price;
        this.bindingType = bindingType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(String author) {
        this.authors.add(author);
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name=" + name +
                ", authors=" + authors +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                ", pagesNumber=" + pagesNumber +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }


}
