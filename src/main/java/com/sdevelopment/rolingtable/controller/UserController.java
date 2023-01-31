package com.sdevelopment.rolingtable.controller;

import com.sdevelopment.rolingtable.components.User;
import com.sdevelopment.rolingtable.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path = "/users")
    public ResponseEntity<?> listUsers() {
        log.info("UsersController:  list users");
        List<User> resource = userService.getUsers();
        return ResponseEntity.ok(resource);
    }

    @PostMapping(path = "/users")
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        log.info("UsersController:  list users");
        User resource = userService.saveUser(user);
        return ResponseEntity.ok(resource);
    }
}
