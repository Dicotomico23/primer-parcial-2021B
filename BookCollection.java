package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {

    private String name;
    private List<Book> books;

    public BookCollection(String name){
        books = new ArrayList<>();
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
    public int getStars(){
        int avrg = 0;
        for(int cont=0;cont<books.size();cont++)avrg += getStars();
        avrg /= books.size();
        return avrg;
    }
}
