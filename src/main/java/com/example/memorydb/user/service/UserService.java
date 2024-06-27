package com.example.memorydb.user.service;

import com.example.memorydb.user.db.UserRepository;
import com.example.memorydb.user.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // 여기서 Service 영역이라고 표시
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public UserEntity save(UserEntity user){
        return userRepository.save(user);
        //save 구현체는 어디냐? SimpleDataRepository


    }

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    public void delete(Long id){
        userRepository.delete(id);
    }

    public Optional<UserEntity> findById(Long id){
         return  userRepository.findById(id);
    }

    public List<UserEntity> filterScore(int score){
        return userRepository.findAllScoreGreaterThen(score);
    }
}
