package com.example.onlineshopapp.mock;

import com.example.onlineshopapp.user.Status;
import com.example.onlineshopapp.user.TypeAccount;
import com.example.onlineshopapp.user.UserEntity;
import com.example.onlineshopapp.user.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.sql.Date;
import java.time.Instant;

@Service
public class MockData {

    private final UserRepository userRepository;


    public MockData(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void mockData(){

        UserEntity userEntity = new UserEntity(
                null,
                "John",
                "Snow",
                "login",
                "haslo",
                "addres",
                Date.from(Instant.now()),
                Status.ACTIVE,
                TypeAccount.PREMIUM);
        userRepository.save(userEntity);

    }
}
