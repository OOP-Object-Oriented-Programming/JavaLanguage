package com.codewithakiya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library<T> {
    private List<T> books = new ArrayList<>();

    public Library(List<T> books){
        this.books = books;
    }

    public List<T> getBooks(){
        return books;
    }

    @Override
    public String toString(){
        return Arrays.toString(books.toArray());
    }
}
