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
import java.util.Objects;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    public static final UserEntity USER_ENTITY_JOHN_WEAK = new UserEntity(
            null,
            "John",
            "Weak",
            "John123",
            "John123",
            new Address("ul. Testowa 12", "Poznań", "12-123", "Poland"),
            Date.from(Instant.now()),
            Status.ACTIVE,
            TypeAccount.NORMAL
    );

    public static final User USER_JAN_KOWALSKI = new User(
            "Jan",
            "Kowalski",
            "janek12345",
            new Address("ul. Testowa 12", "Poznań", "12-123", "Poland"),
            TypeAccount.PREMIUM
    );

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @BeforeEach
    void setUp() {

    }

    @Test
    void shouldSaveClientToRepository() {
        //given
        final ResponseEntity<Void> voidResponseEntity = testRestTemplate.postForEntity("/users", USER_JAN_KOWALSKI, Void.class);

        //when
        List<UserEntity> usersEntity = userRepository.findAll();

        //then
        Assertions.assertThat(voidResponseEntity.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        Assertions.assertThat(usersEntity.size()).isEqualTo(2);
    }

    @Test
    void shouldReturnUserIfExist() {
        //given

        //when
        final ResponseEntity<User> forEntity = testRestTemplate.getForEntity("/users/1", User.class);

        //then
        assertThat("john123").isEqualTo(Objects.requireNonNull(forEntity.getBody()).getLogin());
     }

}
