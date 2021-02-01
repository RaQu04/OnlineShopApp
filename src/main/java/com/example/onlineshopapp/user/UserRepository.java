package com.example.onlineshopapp.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    List<User> findAllBySurname(String surname);
    List<User> findAllByName(String name);
    List<User> findAllByStatus(Status status);
    List<User> findAllByTypeAccount(TypeAccount typeAccount);

}
