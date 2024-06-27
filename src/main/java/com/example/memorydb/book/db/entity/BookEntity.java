package com.example.memorydb.book.db.entity;

import com.example.memorydb.entity.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity extends Entity {
    private String name;
    private String category;
    private BigDecimal amount;
}
