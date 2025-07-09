package com.therohitpatwa;

public class Book extends LibraryItem{
    private String barCodeNum;
    private BookGenere bookGenere;
    public Book(int stock, String name, String author, String publishDate, String publisher,String barCodeNum,BookGenere bookGenere) {
        super(stock, name, author, publishDate, publisher);
        this.barCodeNum=barCodeNum;
        this.bookGenere=bookGenere;

    }
    public void getInfo()
    {

    }
    public int getLateFees(int days)
    {
        return 0;
    }


}
