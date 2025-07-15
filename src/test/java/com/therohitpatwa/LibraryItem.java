package com.therohitpatwa;

public abstract class LibraryItem {
    private int stock;
    private String name;
    private String author;
    private String publishDate;
    private String publisher;
    private int days;


    public LibraryItem(int stock, String name, String author, String publishDate, String publisher) {
        this.stock = stock;
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
        this.publisher = publisher;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }



    public boolean isAvailable() {
        return (stock > 0);
    }

    public void returnItem()
    {
        this.stock = this.stock + 1;
    }

    public void borrowItem() {
        this.stock = this.stock - 1;

    }



    public abstract void getInfo();

    public abstract double getLateFees(int days);


}
