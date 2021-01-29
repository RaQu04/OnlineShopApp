package com.example.onlineshopapp.user;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Long createUserEntity(User user) {
        final UserEntity userEntity = userRepository.save(new UserEntity(
                null,
                user.getName(),
                user.getSurname(),
                user.getLogin(),
                user.getPassword(),
                user.getAddress(),
                user.getDateOfCreatedAccount(),
                user.getStatus(),
                user.getTypeAccount()));
        return userEntity.getId();
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUser(Long id) {
        return userRepository.findById(id)
                .map(User::fromUserEntity);
    }
}
