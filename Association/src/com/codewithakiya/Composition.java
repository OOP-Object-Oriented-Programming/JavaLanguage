package com.codewithakiya;

import java.util.ArrayList;
import java.util.List;

public class Composition {

    static public void main(String...items){
        var book1 = new Book<>("One minute manager","Mr.ABC");
        var book2 = new Book<>("Design Pattern","Mr.ABC");
        var book3 = new Book<>("Java Core","Mr.ABC");

        var books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        var library = new Library<>(books);
        System.out.println(library.toString());
    }
}
