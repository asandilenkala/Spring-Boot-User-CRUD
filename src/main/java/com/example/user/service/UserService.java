package com.example.user.service;

import com.example.user.model.User;
import com.example.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserByEmail(User user){
        Optional<User> findingUserByEmail = userRepository.findUserByEmail(user.getEmail());

        if (findingUserByEmail.isPresent()){
            return userRepository.findUserByEmail(user.getEmail());
        }
        throw new IllegalStateException("Email does not exists.");
    }

    public void addUser(User user){
        Optional<User> findingUserByEmail = userRepository.findUserByEmail(user.getEmail());

        if (findingUserByEmail.isPresent()){
            throw new IllegalStateException("Email already exists.");
        }
        userRepository.save(user);
    }
    @Transactional
    public void deleteUser(User user){
        Optional<User> findingUserByEmail = userRepository.findUserByEmail(user.getEmail());

        if (findingUserByEmail.isPresent()){
            userRepository.deleteUserByEmail(user.getEmail());
        }

    }

}
