package com.example.onlineshopapp.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Long createUserEntityFromClientAndGetId(User user) {
        final UserEntity userEntity = userRepository.save(new UserEntity(null, user.getName(), user.getSurname(), user.getCity()));
        return userEntity.getId();
    }

}
