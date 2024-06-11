package com.example.user.controller;

import com.example.user.model.User;
import com.example.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/getUserByEmail")
    public Optional<User> getUserByEmail(@RequestBody User user){
        return userService.getUserByEmail(user);
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @DeleteMapping(path ="/deleteUserByEmail")
    public void deleteUserByEmail(@RequestBody User user){
        userService.deleteUser(user);
    }
}
