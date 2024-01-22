package com.jb.jaxbandjsonexamples.bindings;
public class Book {
    public Integer bookId;
    public String bookName;
    public Double cost;

    public Book(Integer bookId, String bookName, Double cost) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.cost = cost;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
