package com.example.onlineshopapp.user;

import lombok.Value;

@Value
public class User {

    String name;
    String surname;
    String login;
    Address address;
    TypeAccount typeAccount;

    public static User fromUserEntity(UserEntity userEntity) {
        return new User(
                userEntity.getName(),
                userEntity.getSurname(),
                userEntity.getLogin(),
                userEntity.getAddress(),
                userEntity.getTypeAccount());
    }
}
