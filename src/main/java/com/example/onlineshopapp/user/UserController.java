package com.example.onlineshopapp.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<Void> addUser(@RequestBody User user) throws URISyntaxException {
        Long userId = userService.createUserEntity(user);

        return ResponseEntity
                .created(new URI("/users/" + userId))
                .build();
    }

    @GetMapping("/users")
    public List<User> getAllUsers(@RequestParam(required = false) String surname) {
        if (surname == null || surname.isEmpty()) {
            return userService.getAllUsers();
        } else{
            return userService.getUsersBySurname(surname);
        }
    }

    @GetMapping("users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return userService.getUser(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
