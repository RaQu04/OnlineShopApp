package com.example.onlineshopapp.mock;

import com.example.onlineshopapp.user.UserEntity;
import com.example.onlineshopapp.user.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MockData {

    private final UserRepository userRepository;


    public MockData(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void mockData(){

        UserEntity userEntity = new UserEntity(1L, "John", "Snow", "Poznań");
        userRepository.save(userEntity);

    }
}
