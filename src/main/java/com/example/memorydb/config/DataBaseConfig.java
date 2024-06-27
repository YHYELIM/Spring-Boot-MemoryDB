package com.example.memorydb.config;

import com.example.memorydb.user.db.UserRepository;
import org.springframework.context.annotation.Configuration;
//
//@Configuration // 스프링이 실행이 될때 Configuration 찾아서 특정한 내용들을 스프링 컨텍스트에 객체를 만들어줌
//// 스프링컨텍스트에 대한 내용이 필요하다면  스프링이 알아서 주입해줌
//public class DataBaseConfig {
//    public UserRepository userRepository(){
//        return new UserRepository();
//    }
//}

//외부에 있는 클래스를 쓸때는 이 방식을 씀
//UserRepository는 내부에 있는 클래스이므로 @Service 달아서 쓴다