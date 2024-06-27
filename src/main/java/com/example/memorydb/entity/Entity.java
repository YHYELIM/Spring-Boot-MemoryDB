package com.example.memorydb.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public abstract class Entity implements PrimaryKey {
    //PrimaryKey 정의한 id 구현

    private Long id;
}
