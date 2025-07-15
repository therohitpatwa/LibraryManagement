package com.therohitpatwa;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static void main(String[] args) {
        List<LibraryItem>  libraryItems=new ArrayList<>();
        LibraryItem book1 = new Book(12, "Science", "HC", "20-3-25", "KV", "54654654", BookGenere.FICTION,5);
        LibraryItem book2 = new Book(15, "Mathematics", "PB", "18-7-24", "AB", "98765432", BookGenere.NON_FICTION,6);
        LibraryItem book3 = new Book(20, "History", "HC", "12-5-23", "LM", "12345678", BookGenere.BIOGRAPHY,7);
        LibraryItem book4 = new Book(25, "Philosophy", "PB", "30-8-22", "NP", "11223344", BookGenere.CLASSIC,8);
        LibraryItem book5 = new Book(30, "Technology", "HC", "01-1-26", "RT", "55667788", BookGenere.SCIENCE,9);
        LibraryItem book6 = new Book(35, "Travel", "PB", "15-9-24", "ZY", "33445566", BookGenere.ADVENTURE,12);
        libraryItems.add(book1);
        libraryItems.add(book2);
        libraryItems.add(book3);
        libraryItems.add(book4);
        libraryItems.add(book5);
        book2.getInfo();
        book2.borrowItem();
        book2.borrowItem();
        book2.getInfo();
        book2.returnItem();
        book2.getInfo();
        System.out.println("Late fees: "+book2.getLateFees(6));





    }





}
