package com.example.onlineshopapp.mock;

import com.example.onlineshopapp.user.Status;
import com.example.onlineshopapp.user.TypeAccount;
import com.example.onlineshopapp.user.UserEntity;
import com.example.onlineshopapp.user.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.Instant;
import java.util.Date;

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
                "john123",
                "jon123",
                "wymyślony adres 2",
                Date.from(Instant.now()),
                Status.ACTIVE,
                TypeAccount.NORMAL);
        userRepository.save(userEntity);

    }
}
