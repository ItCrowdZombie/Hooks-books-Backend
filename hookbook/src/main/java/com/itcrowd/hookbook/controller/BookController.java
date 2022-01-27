package com.itcrowd.hookbook.controller;

import com.itcrowd.hookbook.model.Book;
import com.itcrowd.hookbook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")

public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping()
    public String add(@RequestBody Book book){
        bookService.saveBook(book);
        return "new book added";
    }

@GetMapping()
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
}

}
