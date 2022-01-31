package com.itcrowd.hookbook.service;

import com.itcrowd.hookbook.model.Book;
import com.itcrowd.hookbook.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImplementation  implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveBook (Book book)
    {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book get(Integer id){
        return bookRepository.findById(id).get();
    }
}


