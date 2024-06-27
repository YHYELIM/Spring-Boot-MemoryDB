package com.example.memorydb.book.db.controller;


import com.example.memorydb.book.db.entity.BookEntity;
import com.example.memorydb.book.db.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor //스프링으로 부터 주입 받을 수 있음 // 생성자를 통해서 생성하겠다
public class BookController {

    // 생성자를 통해서 생성하겠다
    private final BookService bookService;

    @PostMapping("")
    public BookEntity create(@RequestBody BookEntity bookEntity){
       return bookService.create(bookEntity);
    }

    @GetMapping("/all")
    public List<BookEntity> findAll(){
        return  bookService.findAll();
    }
}
