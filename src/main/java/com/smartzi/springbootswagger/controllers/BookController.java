package com.smartzi.springbootswagger.controllers;

import com.smartzi.springbootswagger.models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id){

    }

    @GetMapping("/")
    public List<Book> getAllBooks(){

    }

    @PostMapping("/")
    public Book addBook(@RequestBody Book book){

    }
}
