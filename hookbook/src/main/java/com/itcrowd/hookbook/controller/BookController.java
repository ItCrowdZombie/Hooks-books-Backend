package com.itcrowd.hookbook.controller;

import com.itcrowd.hookbook.model.Book;
import com.itcrowd.hookbook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")

public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public String add(@RequestBody Book book){
        bookService.saveBook(book);
        return "new book added";
    }
}
