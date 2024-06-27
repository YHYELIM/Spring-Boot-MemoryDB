package com.example.memorydb.entity;

public interface PrimaryKey {
    //PK가 가지게 되는 인터페이스

    //set - id값을 객체 id에 설정 , get - id값 읽음
    void setId (Long id);
    Long getId();
}
