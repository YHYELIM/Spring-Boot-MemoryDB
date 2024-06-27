package com.example.memorydb.db;

import java.util.List;
import java.util.Optional;

public interface DataRepository <T, ID> extends Repository<T,ID>{

    // CRUD 기능 가짐
    // 데이터의 ID를 통해서 리턴
    // id 존재 -> update, 없으면 -> create

    //create
    T save(T data); // 저장 후 받은 데이터 타입으로 다시 리턴

    //read
    Optional<T> findById(ID id); // 데이터가 있을수도 없을수도 있어서 Optional로 리턴

    List<T> findAll();

    //delete
    void delete (ID id);

}
