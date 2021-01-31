package com.example.onlineshopapp.user;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public static Date createDateOfStartAccount(){
        return Date.from(Instant.now());
    }

    public static String createDefaultPassword(User user){
        return user.getLogin();
    }

    public Long createUserEntity(User user) {
        final UserEntity userEntity = userRepository.save(new UserEntity(
                null,
                user.getName(),
                user.getSurname(),
                user.getLogin(),
                passwordEncoder.encode(createDefaultPassword(user)),
                user.getAddress(),
                createDateOfStartAccount(),
                Status.ACTIVE,
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

    public List<UserEntity> getUsersBySurname(String surname) {
        return userRepository.findBySurname(surname);
    }
}
