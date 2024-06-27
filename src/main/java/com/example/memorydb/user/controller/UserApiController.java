package com.example.memorydb.user.controller;

import com.example.memorydb.entity.Entity;
import com.example.memorydb.user.model.UserEntity;
import com.example.memorydb.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;
    //update or create
    @PutMapping("")
    public UserEntity create (
            @RequestBody UserEntity userEntity
            ){
        //사용자로 부터 들어온 내용을 return
        return userService.save(userEntity);

    }


    @GetMapping("/all")
    public List<UserEntity> findAll(){
        return userService.findAll();
    }

    @DeleteMapping("/id/{id}")
    public void delete (
            @PathVariable Long id
    ){

        userService.delete(id);

    }

    @GetMapping("/id/{id}")
    public UserEntity findAll(
            @PathVariable Long id
    ){
        var response =  userService.findById(id);
        return response.get();
    }

}