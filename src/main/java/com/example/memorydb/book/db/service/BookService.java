package com.example.memorydb.book.db.service;

import com.example.memorydb.book.db.entity.BookEntity;
import com.example.memorydb.book.db.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

//    @Autowired
//    private BookRepository bookRepository;

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;

    }


    //create, update
    public BookEntity create(BookEntity book){
        return bookRepository.save(book);
    }



    //all
    public List<BookEntity> findAll(){
        return bookRepository.findAll();
    }

    //delete

    //find one


}
