package com.example.memorydb.book.db.repository;

import com.example.memorydb.book.db.entity.BookEntity;
import com.example.memorydb.db.SimpleDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Bean 등록
public class BookRepository extends SimpleDataRepository<BookEntity, Long> {
}
