package com.itcrowd.hookbook.controller;

import com.itcrowd.hookbook.model.Book;
import com.itcrowd.hookbook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin

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

    @GetMapping("/{id}")
    public ResponseEntity<Book> get (@PathVariable Integer id){
        try{
            Book book=bookService.get(id);
            return new ResponseEntity<Book>(book, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
        }

    }


}


