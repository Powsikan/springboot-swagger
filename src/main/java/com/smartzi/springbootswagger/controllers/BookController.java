package com.smartzi.springbootswagger.controllers;

import com.smartzi.springbootswagger.models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    List<Book> books = new ArrayList<>();

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id){
        return books.get(id);
    }

    @GetMapping("/")
    public List<Book> getAllBooks(){
        return books;
    }

    @PostMapping("/")
    public Book addBook(@RequestBody Book book){
        books.add(book);
        return book;
    }
}
