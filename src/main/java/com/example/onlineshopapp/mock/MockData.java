package com.example.onlineshopapp.mock;

import com.example.onlineshopapp.user.*;
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
                "john123",
                "jon123",
                new Address("ul. Testowa 12", "Poznań", "12-123", "Poland"),
                Date.from(Instant.now()),
                Status.ACTIVE,
                TypeAccount.PREMIUM);
        userRepository.save(userEntity);

    }
}
