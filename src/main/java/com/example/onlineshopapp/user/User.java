package com.example.onlineshopapp.user;

import lombok.Value;

import java.util.Date;

@Value
public class User {

    String name;
    String surname;
    String login;
    String password;
    String address;
    Date dateOfCreatedAccount;
    Status status;
    TypeAccount typeAccount;

    public static User fromUserEntity(UserEntity userEntity) {
        return new User(
                userEntity.getName(),
                userEntity.getSurname(),
                userEntity.getLogin(),
                userEntity.getPassword(),
                userEntity.getAddress(),
                userEntity.getDateOfCreatedAccount(),
                userEntity.getStatus(),
                userEntity.getTypeAccount());
    }
}
