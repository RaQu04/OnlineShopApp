package com.example.onlineshopapp.user;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    public static final UserEntity USER_ENTITY_JOHN_WEAK = new UserEntity(
            null,
            "John",
            "Weak",
            "John123",
            "john123",
            "testowa 123",
            Date.from(Instant.now()),
            Status.ACTIVE,
            TypeAccount.NORMAL
    );

    public static final User USER_JAN_KOWALSKI = new User(
            "Jan",
            "Kowalski",
            "janek123",
            "janek12345",
            "testowa321",
            null,
            Status.ACTIVE,
            TypeAccount.PREMIUM
    );

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @BeforeEach
    void setUp() {
//        userRepository.deleteAll();
    }

    @Test
    void shouldSaveClientToRepository() {

        //given
        final ResponseEntity<Void> voidResponseEntity = testRestTemplate.postForEntity("/users", USER_JAN_KOWALSKI, Void.class);

        //when
        List<UserEntity> usersEntity = userRepository.findAll();

        //then
        Assertions.assertThat(voidResponseEntity.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        Assertions.assertThat(usersEntity.size()).isEqualTo(1);
    }

    @Test
    void shouldReturnUserWhenExistInRepository() {
        //given
        userRepository.deleteAll();
        userRepository.save(USER_ENTITY_JOHN_WEAK);

        //when
        ResponseEntity<User> forEntity = testRestTemplate.getForEntity("/users/2", User.class);

        //then
        assertThat(forEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(forEntity.getBody()).isNotNull();
        assertThat(forEntity.getBody().getLogin()).isEqualTo("John123");
    }

}
