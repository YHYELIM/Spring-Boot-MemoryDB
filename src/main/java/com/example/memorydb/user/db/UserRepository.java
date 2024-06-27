package com.example.memorydb.user.db;

import com.example.memorydb.db.SimpleDataRepository;
import com.example.memorydb.user.model.UserEntity;
import org.springframework.stereotype.Service;
@Service
public  class UserRepository extends SimpleDataRepository<UserEntity, Long> {
    //유저 엔티티, Long 타입 데이터 가짐

}
