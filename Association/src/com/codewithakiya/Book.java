package com.codewithakiya;

public class Book<T> {
    private T title;
    private T author;

    public Book(T title, T author){
        this.title = title;
        this.author = author;
    }

    public T getTitle(){
        return title;
    }

    public T getAuthor(){
        return author;
    }

    @Override
    public String toString(){
        return "Book { " + title + ", "
                + author + " } ";
    }
}
