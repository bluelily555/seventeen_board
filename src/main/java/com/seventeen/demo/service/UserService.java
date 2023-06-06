package com.seventeen.demo.service;

import com.seventeen.demo.domain.User;
import com.seventeen.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    //C
    public void userJoin(User user) {
        //비밀번호 암호화 추가 필요함
        user.setCreatedAt(LocalDateTime.now());
        user.setModifiedAt(LocalDateTime.now());

        userRepository.save(user);
    }

    //R
    public boolean userLogin(User user) {
        //비밀번호 암호화 추가 필요함
        return userRepository.existsByIdAndPwd(user.getId(), user.getPwd());
    }
    //U
    //D
}
