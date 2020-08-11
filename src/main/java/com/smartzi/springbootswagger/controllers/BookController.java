package com.smartzi.springbootswagger.controllers;

import com.smartzi.springbootswagger.models.Book;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    HashMap<Integer,Book> books = new HashMap<>();

    @GetMapping("/{id}")
    @ApiOperation(value = "Find Book by id",
                  notes = "Provide an id to look up specific book from the Library",
                  response = Book.class)
    public Book getBook(@PathVariable int id){
        return books.get(id);
    }

    @GetMapping("/")
    public List<Book> getAllBooks(){
        return new ArrayList<Book>(books.values());
    }

    @PostMapping("/")
    public Book addBook(@RequestBody Book book){
        books.put(book.getId(),book);
        return book;
    }
}
