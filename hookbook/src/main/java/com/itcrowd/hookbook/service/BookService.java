package com.itcrowd.hookbook.service;

import com.itcrowd.hookbook.model.Book;

import java.util.List;

public interface BookService {

    public Book saveBook (Book book);
    public List<Book> getAllBooks();

    public Book get(Integer id);
}
