package com.therohitpatwa;

public class Book extends LibraryItem{
    private String barCodeNum;
    private BookGenere bookGenere;
    private double fine;



    public Book(int stock, String name, String author, String publishDate, String publisher,String barCodeNum,BookGenere bookGenere,double fine) {
        super(stock, name, author, publishDate, publisher);
        this.barCodeNum=barCodeNum;
        this.bookGenere=bookGenere;
        this.fine=fine;

    }
    public void getInfo()
    {
        System.out.println("The stock of book is: "+ this.getStock());
        System.out.println("The name of the book is: "+ this.getName());
        System.out.println("The author of the book is: "+ this.getAuthor());
        System.out.println("The Published date is: "+ this.getPublishDate());
        System.out.println("The publisher is: "+this.getPublisher());
        System.out.println("The barcode number: "+this.barCodeNum);
        System.out.println("The book Genere: "+this.bookGenere);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public double getLateFees(int days)
    {
        return days*this.fine;
    }



}
